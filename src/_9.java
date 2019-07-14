public class _9 {
    public class Solution {
        public int JumpFloorII(int target) {
            if (target <= 2){
                return target;
            }
            int[] a = new int[target+1];
            a[1] = 1;
            a[2] = 2;
            for (int i = 3; i <= target; i++){
                a[i] = 2 * a[i-1];
            }
            return a[target];

        }
    }
}
