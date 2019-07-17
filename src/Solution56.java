/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution56 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;//##0个或者1 个节点不涉及重复问题.
        }
        //#####if里面套while
        ListNode node = pHead;
        if (pHead.val == pHead.next.val) {
            node = pHead.next;  //头结点自己后移,但是下面的while是每次node后移都跟头结点比较,直到不同,则此时的node为新node
            while (node != null && node.val == pHead.val) {  //看跟第一个点是否相同即可,注意判断null.
                node = node.next;
            }
            return deleteDuplication(node);  //此时的node已经是第一个不重复的点,##并不是原来的头结点(重复就不要).上面的while是如果不同,node不后移.这里递归出去,下一次就会到else那边.
        } else {
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }
    }
}