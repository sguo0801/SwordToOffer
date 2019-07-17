public class _55 {
    public class Solution {

        public ListNode EntryNodeOfLoop(ListNode pHead) {
            if (pHead == null || pHead.next == null) {
                return null;
            }
            ListNode fast = pHead;
            ListNode slow = pHead;
            while (fast != null && fast.next != null) {  //不要到next.next.
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    fast = pHead;
                    while (fast != slow) {  //直接放在if里面即可,不要用break.
                        fast = fast.next;
                        slow = slow.next;
                    }
                    return fast;
                }
            }
            return null;
        }
    }
}
