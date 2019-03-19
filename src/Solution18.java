/**
 public class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;

 public TreeNode(int val) {
 this.val = val;

 }

 }
 */
//二叉树镜像
public class Solution18 {
    public void Mirror(TreeNode root) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right == null){
            return;
        }
        //开始交换根节点下面的第一层.
        TreeNode cur = root.left;
        root.left = root.right;
        root.right = cur;
        //往下面递进,使用递归.
        if (root.left != null){
             Mirror(root.left);
        }
        if (root.right != null){
            Mirror(root.right);
        }
    }
}