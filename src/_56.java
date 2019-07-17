public class _56 {
    public class Solution {
        public ListNode deleteDuplication(ListNode pHead)
        {
            if (pHead == null || pHead.next == null){
                return pHead;
            }
            pHead.next = deleteDuplication(pHead.next);
            return pHead.val == pHead.next.val ? pHead.next : pHead;  //比如aab这样子,最后返回的头是第二个a.

        }
    }
}
