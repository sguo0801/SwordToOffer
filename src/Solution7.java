public class Solution7 {
    //斐波那契数列,且有第0项
    public int Fibonacci(int n) {
        if (n <= 1){  //先把特殊的写出来,后面return返回不包括前两项.
            return n;
        }
        int[] fib = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < n+1; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}