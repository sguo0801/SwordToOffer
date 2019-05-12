//矩阵路径问题,再看吧
public class Solution65 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] flag = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (judge(matrix, i, j, rows, cols, flag, str, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean judge(char[] matrix, int i, int j, int rows, int cols, boolean[] flag, char[] str, int k) {
        int index = i * cols + j;
        if (i >= rows || j >= cols || i < 0 || j < 0 || matrix[index] != str[k] || flag[index]) {
            return false;
        }
        if (k == str.length - 1) {
            return true;
        }
        flag[index] = true;
        if (judge(matrix, i - 1, j, rows, cols, flag, str, k + 1) ||
                judge(matrix, i + 1, j, rows, cols, flag, str, k + 1) ||
                judge(matrix, i, j - 1, rows, cols, flag, str, k + 1) ||
                judge(matrix, i, j + 1, rows, cols, flag, str, k + 1)) {
            return true;
        }
        flag[index] = false;
        return false;
    }
}