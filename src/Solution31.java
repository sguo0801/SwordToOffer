//求整数中1的个数
public class Solution31 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int ones = 0;
        for (long m = 1; m <= n; m *= 10) {
            long a = n / m;
            long b = n % m;
            if ((a % 10 == 1)) {   //##对10取余判断是否当前位是1
                ones += (a + 8) / 10 * m + (b + 1);
            } else {
                ones += (a + 8) / 10 * m;
            }
        }
        return ones;
    }
}