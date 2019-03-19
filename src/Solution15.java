/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution15 {
    public ListNode ReverseList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null){
            next = head.next;  //先把后面的节点保存好,作为后面移动的目标.
            head.next = pre;  //开始反转.最开始的pre为null,相当于最后的尾节点指向null.
            pre = head;  //后移
            head = next;  //后移作为下一循环的判断.直到为null时,则pre为新链表的头结点.
        }
        return pre;
    }
}