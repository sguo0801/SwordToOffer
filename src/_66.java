public class _66 {
    public class Solution {
        public int movingCount(int threshold, int rows, int cols) {
            boolean[][] judge = new boolean[rows][cols];
            return dps(0, 0, threshold, rows, cols, judge);
            //不需要特意设置count计数,最后到边界返回0,回溯时+1即可
        }

        private int dps(int i, int j, int threshold, int rows, int cols, boolean[][] judge){
            if (i < 0 || i >= rows || j < 0 || j >= cols || judge[i][j] || isNum(i) + isNum(j) > threshold){
                return 0;
            }
            judge[i][j] = true;
            return dps(i+1, j, threshold, rows, cols, judge) + dps(i, j+1, threshold, rows, cols, judge) +
                    dps(i-1, j, threshold, rows, cols, judge) + dps(i, j-1, threshold, rows, cols, judge) + 1;
        }
        private int isNum(int i){
            int num = 0;
            while (i != 0){
                num += i % 10;
                i /= 10;
            }
            return num;
        }
    }
}
