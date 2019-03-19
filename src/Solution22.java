import java.util.ArrayList;
//从上往下打印二叉树
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
public class Solution22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();  //这里是最后要的按层的遍历节点值.
        ArrayList<TreeNode> queue = new ArrayList<>();  //这个队列是放节点的,里面是节点按层排序的顺序.
        if (root == null) {
            return list;  //默认就是容量为10的空列表.内部是数组实现,扩容一次为1.5倍.
        }
        queue.add(root);  //先把根节点放进去.
        while (queue.size() != 0) {
            TreeNode temp = queue.remove(0);  //都是拿出第一个节点.先用temp代替,然后赋值.
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            list.add(temp.val);
        }
        return list;
    }
}