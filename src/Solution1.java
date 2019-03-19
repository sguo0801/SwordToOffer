public class Solution1 {
    public boolean Find(int target, int [][] array) {
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col >= 0){
            if (array[row][col] == target){
                return true;
            }else if (array[row][col] < target){
                row++;
            }else {
                col--;
            }
        }
        return false;
    }
}