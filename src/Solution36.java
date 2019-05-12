/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }

        int length1 = getLength(pHead1);
        int length2 = getLength(pHead2);
        ListNode curr1 = pHead1;
        ListNode curr2 = pHead2;
        if(length1 > length2){
            int len = length1 - length2;
            while(len > 0){
                curr1 = curr1.next;
                len--;
            }
            while(curr1 != curr2){
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            return curr1;
        }else{

            int len = length2 - length1;
            while(len > 0){
                curr2 = curr2.next;
                len--;
            }
            while(curr1 != curr2){
                curr1 = curr1.next;
                curr2 = curr2.next;
            }
            return curr2;
        }
    }

    public int getLength(ListNode curr){
        int len = 0;
        if(curr == null){
            return 0;
        }

        while(curr != null){
            curr = curr.next;
            len++;
        }
        return len;
    }
}