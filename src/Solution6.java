import java.util.ArrayList;
//旋转数组的最小数字
public class Solution6 {
    public int minNumberInRotateArray(int [] array) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] < array[high]) {
                high = mid;
            } else if (array[mid] == array[high]) {
                high = high - 1;  //相当于从后往前遍历.
            } else {
                low = mid + 1;
            }
        }
        return array[low];
    }
}