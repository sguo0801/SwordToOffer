//二维数组的查找.
//数组跟矩阵不一样,不能简单的比较,还要找到每一行的最大长度作为col的范围.
//所以现在从左下角开始遍历,
public class Solution {
    public boolean Find(int target, int [][] array) {
//        if (array[0][0] > target){  //为什么不能要这个限制条件,与下面的最后return false重复?
//            return false;
//        }
        int row = array.length - 1;
        int col = 0;
        int maxCol = 0;  //每一行的最大长度(不相同的),找出最大长度作为边界,而不是用array[0].length.
        for (int i = 0; i <= row; i++){
            if (array[i].length > maxCol){
                maxCol = array[i].length;
            }
        }
        while (row >= 0 && col < maxCol){  //macCol是长度,索引为-1.
            if (col >= array[row].length){  //这一行元素不多,就直接上移,包括等于边界,也是没有对应元素.
                row--;
            }else if (array[row][col] < target){
                col++;
            }else if (array[row][col] > target){
                row--;
            }else {
                return true;
            }
        }
        return false;
    }
}
