import java.util.ArrayList;

public class _19 {
    public class Solution {
        public ArrayList<Integer> printMatrix(int [][] matrix) {
            ArrayList<Integer> res = new ArrayList<Integer>();
            int tr = 0;
            int tc = 0;
            int dr = matrix.length - 1;
            int dc = matrix[0].length - 1;
            while (tr <= dr && tc <= dc){
                fun(res, tr++, tc++, dr--, dc--, matrix);
            }
            return res;
        }

        private void fun(ArrayList<Integer> res, int tr, int tc, int dr, int dc, int [][] matrix){
            if(tr == dr){
                for (int i = tc; i <= dc; i++){
                    res.add(matrix[tr][i]);
                }
            }else if (tc == dc){
                for (int i = tr; i <= dr; i++){
                    res.add(matrix[i][tc]);
                }
            }else {
                int curR = tr;
                int curC = tc;
                //都是不加末端的,算下一次打印的开始
                while (curC < dc){
                    res.add(matrix[tr][curC]); //注意添加的元素横纵坐标,都是跟首末行列有关
                    curC++;
                }
                while (curR < dr){
                    res.add(matrix[curR][dc]);
                    curR++;
                }
                while (curC > tc){
                    res.add(matrix[dr][curC]);
                    curC--;
                }
                while (curR > tr){
                    res.add(matrix[curR][tc]);
                    curR--;
                }

            }
        }
    }
}
