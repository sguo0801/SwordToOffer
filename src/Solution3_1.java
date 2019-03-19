/**
 * public class ListNode {
 * int val;
 * ListNode next = null;
 * <p>
 * ListNode(int val) {
 * this.val = val;
 * }
 * }
 */
//递归实现链表逆序打印.

import java.util.ArrayList;
//从尾巴打印链表,此处不用栈.用递归.
public class Solution3_1 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode != null ) {
            if (listNode.next != null) {  //知道下一个为空,则直接把值给listNode.
                arrayList = printListFromTailToHead(listNode.next);
            }
            arrayList.add(listNode.val);
        }
        return arrayList;
    }
}