public class _4 {
    public class Solution {
        public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            return helper(pre, 0, pre.length- 1, in, 0, in.length-1);

        }
        private TreeNode helper(int [] pre, int prestart, int preend, int [] in, int instart, int inend){
            if (prestart > preend || instart > inend){  //##必须是用索引限定.数组长度不变
                return  null;
            }
            TreeNode root = new TreeNode(pre[prestart]);
            int feed = 0;
            for (int i = instart; i <=inend; i++){
                if (in[i] == pre[prestart]){
                    feed = i;
                    break;
                }
            }
            int count = feed - instart;
            root.left = helper(pre, prestart+1, prestart+count, in, instart, feed-1);
            root.right = helper(pre, prestart+count+1, preend, in, feed+1, inend);
            return root;
        }
    }
}
