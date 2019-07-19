import java.util.Stack;

public class _62 {
    public class Solution {
        TreeNode KthNode(TreeNode pRoot, int k)
        {
            if (pRoot == null){
                return null;
            }
            Stack<TreeNode> stack = new Stack<>();
            while (pRoot != null || !stack.empty()){
                while (pRoot != null){
                    stack.push(pRoot);
                    pRoot = pRoot.left;
                }

                pRoot = stack.pop();
                if (--k == 0){
                    return pRoot;
                }
                pRoot = pRoot.right;
            }
            return null;

        }


    }
}
