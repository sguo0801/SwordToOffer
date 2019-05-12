import java.util.ArrayList;
import java.util.Stack;

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
public class Solution59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if (pRoot == null) {
            return list;
        }
        int layer = 1;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(pRoot);
        while (!s1.empty() || !s2.empty()) {
            if ((layer & 1) != 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.empty()) {
                    TreeNode node = s1.pop();
                    if (node != null) {  //可能添加了null进去.
                        temp.add(node.val);
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }//这一行添加完毕.
                if (!temp.isEmpty()) {  //如果是最后一行为空,则不必layer++
                    layer++;
                    list.add(temp);

                }
                //temp.clear();
            } else {
                ArrayList<Integer> temp = new ArrayList<>();  //##不能随便省空间,不要用clear().容量会有问题
                while (!s2.empty()) {
                    TreeNode node = s2.pop();
                    if (node != null) {  //可能添加了null进去.
                        temp.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }//这一行添加完毕.
                if (!temp.isEmpty()) {  //如果是最后一行为空,则不必layer++,且是list.isEmpty().
                    layer++;
                    list.add(temp);
                }
                //temp.clear();
            }
        }
        return list;
    }
}