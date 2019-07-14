public class _17 {
    //当前根为节点的树是不是相同或者递归再找下一组树
    public class Solution {
        public boolean HasSubtree(TreeNode root1,TreeNode root2) {
            if (root1 == null ||root2 == null){
                return false;
            }
            return isSame(root1, root2) || HasSubtree(root1.right, root2) || HasSubtree(root1.left, root2);  //##看当前是否相同,再看递归能否找到下一组树

        }
        private boolean isSame(TreeNode root1,TreeNode root2){
            if(root2 == null){   //就是这里的区分.子结构不为所有叶子节点都相同,只包含,root2先为null
                //则说明包含,之前进入same方法时保证根已经不为空.所以这里无需担心.
                return true;
            }
            if(root1 == null ){
                return false;
            }
            if (root1.val != root2.val){
                return false;
            }
            return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
        }
    }

}
