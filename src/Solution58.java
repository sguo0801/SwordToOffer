/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
//对称的二叉树
public class Solution58 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot == null){
            return true;
        }
        return fun(pRoot.left, pRoot.right);
    }

    private boolean fun(TreeNode t1, TreeNode t2){
        if(t1 == null && t2 == null){
            return true;
        }
        if(t1 != null && t2 != null){
            return t1.val == t2.val && fun(t1.left, t2.right) && fun(t1.right, t2.left);
        }
        return false;
    }
}