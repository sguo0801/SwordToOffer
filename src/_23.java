public class _23 {
    public class Solution {
        public boolean VerifySquenceOfBST(int [] sequence) {
            if (sequence == null || sequence.length == 0){
                return false;
            }
            return isFeed(sequence, 0, sequence.length - 1);

        }
        private boolean isFeed(int[] sequence, int start, int end){
            if(start >= end){
                return true;
            }
            int mid = start;
            for (; mid < end && sequence[mid] < sequence[end]; mid++){  //##这里直接用mid,找到第一个右子树的mid.

            }
            for (int i = mid; i <= end - 1; i++){
                if (sequence[i] < sequence[end]){
                    return false;
                }
            }
            return isFeed(sequence, start, mid - 1) && isFeed(sequence, mid, end - 1);
        }
    }
}
