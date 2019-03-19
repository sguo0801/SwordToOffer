/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//非递归版本合并两个有序递增链表.
public class Solution16_1 {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null || list2 == null) {
            return list1 == null ? list2 : list1;
        }
        //需要一个返回的头结点,还需要当时生成新链的尾节点.
        ListNode head = null;
        ListNode tail = null;
        while (list1 != null && list2 != null) {  //都得遍历完才能结束.因为后面有后移动作,这边直接看自己本身是不是null
            if (list1.val <= list2.val) {
                if (head == null) {  //确定是第一个节点才会幅值给头结点.
                    head = tail = list1;  //确定了头结点,新链中有了一个节点,头尾一样.
                } else {  //新链中有节点了,直接在尾节点处加上新的节点.
                    tail.next = list1;
                    tail = tail.next;
                }
                list1 = list1.next;  //肯定要后移的.第一次也是一样.不能放在else里面
            } else {
                if (head == null) {  //确定是第一个节点才会幅值给头结点.
                    head = tail = list2;  //确定了头结点,新链中有了一个节点,头尾一样.
                } else {  //新链中有节点了,直接在尾节点处加上新的节点.
                    tail.next = list2;
                    tail = tail.next;  //后移tail,也就是新链的尾巴.
                }
                list2 = list2.next;  //原始链还没比较的部分更新新的头结点.
            }
        }
        if (list1 == null) { //上面已经后移过了.
            tail.next = list2;
        }else {
            tail.next = list1;
        }
        return head;
    }
}