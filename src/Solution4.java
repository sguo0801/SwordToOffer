import java.util.Arrays;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//重建二叉树
public class Solution4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0 || in.length == 0){
            return null;
        }
        TreeNode node = new TreeNode(pre[0]);  //根节点找到作为最后输出的头节点.
        //根据根节点在中序数组中找左子树和右子树.
        for (int i = 0; i < in.length; i++){
            if (in[i] == pre[0]){
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i+1), Arrays.copyOfRange(in, 0, i));  //copyOfRange方法是指定数组中复制,左闭右开.
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length), Arrays.copyOfRange(in, i+1, in.length));
            }
        }
        return node;
    }
}

