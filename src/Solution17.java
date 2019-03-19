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
public class Solution17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if (root2 != null && root1 != null){  //作为条件,是if当两个头结点不为null.有讲究,先看root2是否为null.
            if (root1.val == root2.val){
                result = tree1HasTree2(root1, root2);//以这个根节点为为起点判断是否包含Tree2
            }
            if (! result){  //证明这个根节点不包含子树.看它的左子树,注意是返回为result,不是return.可能左边还是错的但是右子树是对的包含的
                result = HasSubtree(root1.left, root2);
            }
            if (! result){
                result = HasSubtree(root1.right, root2);
            }
        }
        return result;
    }
    public boolean tree1HasTree2(TreeNode root1, TreeNode root2){
        if (root2 == null){  //如果root2先遍历完,则证明包含.
            return true;
        }
        if (root1 == null){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }
        return tree1HasTree2(root1.left, root2.left) && tree1HasTree2(root1.right, root2.right);
    }
}