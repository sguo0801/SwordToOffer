public class _18 {
    public class Solution {
        public void Mirror(TreeNode root) {
            if (root == null){
                return;
            }

            TreeNode left = root.left;
            root.left = root.right;
            root.right = left;
            if (root.right != null){
                Mirror(root.right);
            }
            if (root.left != null){
                Mirror(root.left);
            }

        }
    }
}
