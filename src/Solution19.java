import java.util.ArrayList;
//顺时针打印矩阵 不会!!
public class Solution19 {
    ArrayList<Integer> a = new ArrayList<>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int tR = 0;
        int tC = 0;
        int dR = matrix.length - 1;
        int dC = matrix[0].length - 1;
        while (tR <= dR && tC <= dC){  //左上边界最多到达右下边界, 用于判断是否还是剥圈打印
            printEdge(matrix, tR++, tC++, dR--, dC--);
        }
        return a;
    }

    public void printEdge(int[][] m, int tR, int tC, int dR, int dC){
        if (tR == dR){  //先判断是否只是一横行 如果是,打印该横行的列(通常用于内圈.
            for (int i = tC; i <= dC; i++){
                a.add(m[tR][i]);
            }
        }else if (tC == dC){  //再判断是否只是一竖列,如果是,打印该横行的列(通常位与内圈.
            for (int i = tR; i <= dR; i++){
                a.add(m[i][tC]);
            }
        }else {
            int curC = tC;  //用两个变量存储,用于判断当前位置.
            int curR = tR;
            while (curC != dC){
                a.add(m[tR][curC]);  //当前位置未到达当前行的最右列,往右去.
                curC++;
            }
            while (curR != dR){
                a.add(m[curR][dC]);  //当前位置未到达当前列的最低行,往下走.
                curR++;
            }
            while (curC != tC){
                a.add(m[dR][curC]);  //当前位置未到达当前行的最左列,往左去.
                curC--;
            }
            while (curR != tR){
                a.add(m[curR][tC]);  //当前位置未到达当前列的最顶行,往上去.
                curR--;
            }
        }
    }
}