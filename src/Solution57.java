/*
public class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
*/
public class Solution57 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null){
            return null;
        }

        if(pNode.right != null) {  //如果有右节点,则找右子树中的左子节点.
            pNode = pNode.right;
            while(pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }

        while(pNode.next != null){  //如果没有右节点,则找父节点中是对应父节点左孩子 的那个节点,返回那个节点的父节点.
            if(pNode.next.left == pNode){
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;//退到根还没有,说明是最后一个节点,所以下一个为null.
    }
}