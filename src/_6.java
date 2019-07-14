public class _6 {
    public class Solution {
        public int minNumberInRotateArray(int [] array) {
            int left = 0;
            int right = array.length - 1;
            while (left < right){
                int mid = (left + right) >> 1;
                if (array[mid] <= array[right]){
                    right = mid;
                }else {
                    left = mid + 1;
                }
            }
            return array[right];

        }
    }
}
