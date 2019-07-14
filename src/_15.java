public class _15 {
    public class Solution {
        public ListNode ReverseList(ListNode head) {
            ListNode tail = null;
            if (head == null){
                return head;
            }
            ListNode next = null;  //只要两个新节点就可以啦
            while (head != null){
                next = head.next;
                head.next = tail;
                tail = head;
                head = next;
            }
            return tail;

        }
    }
}
