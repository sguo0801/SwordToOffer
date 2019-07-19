public class _65 {
    //回溯,字符矩阵中找字符串匹配.
    public class Solution {
        public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
        {
            char[][] m = new char[rows][cols];
            for (int i = 0; i < matrix.length; i ++){{
                m[i / cols][i % cols] = matrix[i];
            }
            }
            final int[][] next = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            for (int i = 0; i < rows; i++){
                for (int j = 0; j < cols; j++){
                    if(dps(m, rows, cols, i, j, next, str, 0)){
                        return true;
                    }
                }
            }
            return false;

        }
        private boolean dps(char[][] m, int rows, int cols, int i, int j, int[][] next, char[] str, int num){
            if (num == str.length){
                return true;
            }
            if (i < 0 || i >= rows || j < 0 || j >= cols || m[i][j] != str[num]){
                return false;
            }

            m[i][j] ^= 256;
            for (int[] d : next){
                if (dps(m, rows, cols, i + d[0], j + d[1], next, str, num + 1)){
                    return true;
                }
            }
            m[i][j] ^= 256;
            return false;
        }
    }
}
