public class Solution37 {
    public int GetNumberOfK(int[] array, int k) {
        return stateNum(array, k + 0.5) - stateNum(array, k - 0.5);
    }

    public int stateNum(int[] array, double k) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {  //##注意这个边界是<= 而且while在mid前面
            int mid = (high + low) >> 1;
            if (array[mid] < k) {  //##没有==
                low = mid + 1;  //##+1
            } else if (array[mid] > k) {
                high = mid - 1;  //##-1
            }
        }
        return low;
    }
}