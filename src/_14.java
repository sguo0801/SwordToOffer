public class _14 {
    public class Solution {
        public ListNode FindKthToTail(ListNode head,int k) {
            ListNode fast = head;
            ListNode slow = head;
            int i = 0;
            //直接一边可以走两个节点,且把链表长度i求出来
            for (; fast != null; i++){  //这边是fast最后到尾节点的后面,所以是>=k时,slow开始走.
                if (i >= k){
                    slow = slow.next;
                }
                fast = fast.next;
            }
            return i < k ? null : slow;

        }
    }
}
