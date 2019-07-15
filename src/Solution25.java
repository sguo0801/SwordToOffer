/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
//复杂链表的幅值,o(n)时间复杂度,不需要其他空间复杂度
public class Solution25 {
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {  //头结点是空,则返回空.
            return null;
        }
        RandomListNode list = pHead;  //作为遍历的节点.
        //第一遍是复制出第二个节点放在原始节点的后面.
        while (list != null) {
            RandomListNode node = new RandomListNode(list.label);  //作为复制的节点,是根据值来的.
            node.next = list.next;  //先连后面
            list.next = node;  //再跟前面连.
            list = list.next.next;  //更新list.
        }

        //第二遍连接random
        list = pHead;
        while (list != null){
            if (list.random != null){
                list.next.random = list.random.next;
            }else {
                list.next.random = null;
            }
            list = list.next.next;
        }

        //第三遍进行分离两条链.
        list = pHead;
        RandomListNode res = null;  //作为新链表的固定头结点,后面的返回值.
        RandomListNode temp = null;  //作为分离出来的过渡节点.
        RandomListNode newlist = null;  //就是新链,复制出来的末端节点后移.
        while (list != null){
            temp = list.next;
            list.next = list.next.next;  //原始链表的连接
            temp.next = null;  //先把分离出来的节点指向为空.
            list = list.next;  //更新好新的list
            if (newlist == null){
                res = temp;
                newlist = temp;
            }else {
                newlist.next = temp;
                newlist = newlist.next;
            }

        }
        return res;

    }
}