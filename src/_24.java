import java.util.ArrayList;

public class _24 {
    public class Solution {
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            if (root == null){
                return res;
            }
            dps(list, res, root, target);
            return res;

        }
        private void dps(ArrayList<Integer> list, ArrayList<ArrayList<Integer>> res, TreeNode root, int target){
            list.add(root.val);
            if (root.val == target && root.left == null && root.right == null){
                res.add(new ArrayList<>(list));
            }
            if (root.left != null){
                dps(list, res, root.left, target - root.val);
            }
            if (root.right != null){
                dps(list, res, root.right, target - root.val);
            }
            list.remove(list.size() - 1);
        }
    }
}
