import java.util.ArrayList;


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
//按行打印二叉树,分层
public class Solution60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int depth = 1;
        fun(pRoot, 1, list);
        return list;
    }
    void fun(TreeNode root, int depth, ArrayList<ArrayList<Integer>> list) {
        if (root == null) {
            return;
        }
        if (depth > list.size()) { //只要能更深,就多一个列表.
            list.add(new ArrayList<Integer>());  //##注意加ArrayList<>后面的().
        }
        list.get(depth - 1).add(root.val);
        fun(root.left, depth + 1, list);  //先从左子树往下加深加列表,然后再右侧时直接往里面填数,就不需要加列表啦
        fun(root.right, depth + 1, list);// 上下两个depth是一样的,递归回溯时depth会变化.变成原来刚递归的样子.
        // 如果depth在函数中是全局变量而不是作为递归参数,就不会变回来,
    }

}