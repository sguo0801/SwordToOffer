public class Solution30 {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length <= 0) {
            return 0;
        }
        int max = array[0];
        int res = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            res = Math.max(res, max);
        }
        return res;
    }
}
