/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p, q;
        p = q = head;
        int i = 0;
        for (; p != null; i++){  //还是当i = k时,让q节点出发,之前都是p节点在跑,总循环跑到链表末端.
            // i为链表总结点数,如果比倒数的k小,说明已经到头结点前面啦,只能为null
            if (i >= k){
                q = q.next;
            }
            p = p.next;
        }
        return i < k ? null : q;
    }
}