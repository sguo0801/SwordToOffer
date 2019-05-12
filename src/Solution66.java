//机器人
public class Solution66 {
    public int movingCount(int threshold, int rows, int cols) {

        int[][] flag = new int[rows][cols];
        return judge(0, 0, rows, cols, flag, threshold);

    }

    private int judge(int i, int j, int rows, int cols, int[][] flag, int threshold) {

        if (i >= rows || j >= cols || i < 0 || j < 0 || numSum(i) + numSum(j) > threshold || flag[i][j] == 1) {
            return 0;
        }
        flag[i][j] = 1;
        return judge(i - 1, j, rows, cols, flag, threshold) +
                judge(i + 1, j, rows, cols, flag, threshold) +
                judge(i, j - 1, rows, cols, flag, threshold) +
                judge(i, j + 1, rows, cols, flag, threshold) + 1;
    }

    private int numSum(int i) {
        int sum = 0;
        do {
            sum += i % 10;  //这里不可以用位运算
        } while ((i = i / 10) > 0);
        return sum;
    }

}