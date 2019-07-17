public class _58 {
    public class Solution {
        boolean isSymmetrical(TreeNode pRoot)
        {
            return pRoot == null || isFeed(pRoot.left, pRoot.right);
        }

        private boolean isFeed(TreeNode left, TreeNode right){
            if (left == null && right == null){
                return true;
            }
            if (left == null || right == null){
                return false;
            }
            if (left.val != right.val){
                return false;
            }
            return isFeed(left.left, right.right) && isFeed(left.right, right.left);
        }
    }


}
