import java.util.ArrayList;
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
public class Solution24 {
    private ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        //返回的是一个数组列表,且里面每一个元素(一种符合要求的路径)都是一个数组列表,其中是符合要求的路径.
        if (root == null){
            return lists;  //列表为空,说明没有满足的路径.
        }
        list.add(root.val);
        target -= root.val;  //每次目标会更进一步,去掉根节点的值.
        if (target == 0 && root.left == null && root.right == null){  //这说明已经满足了那个整数,且是叶子节点
            lists.add(new ArrayList<>(list));  //把符合要求的添加到大数组列表中.
        }
        FindPath(root.left, target);
        FindPath(root.right, target);  //如果不满足则往下面继续添加叶子节点的值.以及对应的新目标.满足则这一段加到上一段list.
        list.remove(list.size()-1);  //移除最后一个叶子节点.
        return lists;
    }
}