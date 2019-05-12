/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution55 {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null || pHead.next.next == null){
            return null;
        }
        ListNode fast = pHead.next.next;  //##后面while判定要不相同才行.所以初始要都走一次
        ListNode slow = pHead.next;
        while(fast != slow){
            if(fast.next != null && fast.next.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }else{
                return null;
            }
        }
        fast = pHead;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}