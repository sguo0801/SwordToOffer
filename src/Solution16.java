/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//递归版本合并两有序链表.
public class Solution16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null || list2 == null){
            return list1 == null ? list2 : list1;
        }
        if (list1.val <= list2.val){
            list1.next = Merge(list1.next, list2);
            return list1;
        }else {
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}