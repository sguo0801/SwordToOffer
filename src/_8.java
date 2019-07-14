public class _8 {
    public class Solution {
        public int JumpFloor(int target) {
            int[] a = new int[target+1];
            if(target < 2){
                return target;
            }
            a[1] = 1;
            a[2] = 2;
            for (int i = 3; i <= target; i++){
                a[i] = a[i-1] + a[i-2];
            }
            return a[target];


        }
    }
}
