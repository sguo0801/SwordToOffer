/**
 * public class TreeNode {
 * int val = 0;
 * TreeNode left = null;
 * TreeNode right = null;
 * <p>
 * public TreeNode(int val) {
 * this.val = val;
 * <p>
 * }
 * <p>
 * }
 */
//层次遍历,也就是广度优先搜索在树中的应用.

import java.util.*;

public class Solution38 {
    public int TreeDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
            return 0;
        }
        queue.offer(root);
        int count = 0;
        int depth = 0;
        int nextCount = 1;
        while (queue.size() != 0) {
            TreeNode temp = queue.poll();
            count++;
            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }
            if (count == nextCount) {  //就是在遍历上层节点时,把子节点都放入队列中,然后当层节点数达到之前计算好的数量就到下一层,深度+1;
                depth++;
                nextCount = queue.size();
                count = 0;
            }
        }
        return depth;
    }
}