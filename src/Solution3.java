/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
//链表反向打印,一般可以采用栈,或者递归来做.属于后进先出.
import java.util.ArrayList;
import java.util.Stack;

public class Solution3 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //这里用栈
        Stack<Integer>  stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (! stack.empty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}