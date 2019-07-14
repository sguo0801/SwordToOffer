public class _7 {
    public class Solution {
        public int Fibonacci(int n) {
            //##可能n < 2,所以先写出边界情况
            if (n < 2){
                return n;
            }
            int[] a = new int[n+1];
            a[0] = 0;
            a[1] = 1;
            for(int i  = 2; i <= n; i++ ){
                a[i] = a[i-1] + a[i-2];
            }
            return a[n];

        }
    }
}
