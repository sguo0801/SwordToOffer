public class Solution12 {
    //数值的整数次方
    public double Power(double base, int exponent) {
        double curr = base;
        double res = 1;
        int n = exponent;
        if (n < 0){
            if (base == 0){  //指数为负,底数不能为0,否则就是0分之1;
                throw new RuntimeException("分母不能为0");
            }
            exponent = -exponent;
        }else if (n == 0){
            return 1;
        }
        //现在开始,保证exponent都是正的
        while (exponent != 0){  //指数是向右移,则到0说明指数已经移光了.
            if ((exponent & 1) == 1){
                res *= curr;
            }
            curr *= curr;  //底数只要移位啦就会变平方,立方等.底数值指数增长弥补指数的右移变化.
            exponent = exponent >> 1;  //右移一位.

        }

        return n >= 0 ? res : (1/res);  //必须找一个数把初始的exponent记录下来.这边有没有=都可以.

    }
}