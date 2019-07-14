public class _12 {
    public class Solution {
        public double Power(double base, int exponent) {
            //1.首先要把参量保存在新的值中.
            //2.从指数开始分情况
            double a = base;
            int n = exponent;
            double res = 1.0;
            if(n < 0){
                if (base == 0){
                    throw new RuntimeException("异常");
                }
                exponent = - exponent;
            }else if (n == 0){
                return 1.0;
            }
            while (exponent != 0){
                if((exponent & 1)  == 1){  //只针对要乘结果的时候
                    res *= a;
                }
                a *= a;  //其他情况一样底数乘积,指数右移.
                exponent >>= 1;
            }
            return n >= 0 ? res : 1 / res;  //等号有没有都行.

        }
    }
}
