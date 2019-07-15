public class _36 {
    public class Solution {
        public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
            ListNode node1 = pHead1;
            ListNode node2 = pHead2;
            while (node1 != node2){
                node1 = node1== null ? pHead2 : node1.next;
                node2 = node1== null ? pHead1 : node2.next;
            }
            return node1;

        }
    }
}
