public class _25 {
    public class Solution {
        public RandomListNode Clone(RandomListNode pHead) {
            RandomListNode list = pHead;
            if (pHead == null) {
                return null;
            }
            while (list != null) {
                RandomListNode node = new RandomListNode(list.label);
                node.next = list.next;  //连后面一个next
                list.next = node;
                list = list.next.next;
            }

            list = pHead;
            while (list != null) {
                if (list.random != null) {
                    list.next.random = list.random.next;
                } else {
                    list.next.random = null;
                }
                list = list.next.next;
            }

            RandomListNode res = null;
            RandomListNode tail = null;
            RandomListNode temp = null;
            list = pHead;
            while (list != null){
                temp = list.next;
                list.next = list.next.next;
                temp.next = null;
                list = list.next;

                if (tail == null){   //都是针对尾巴的
                    res = temp;
                    tail = temp;
                    //tail = tail.next;  第一次尾巴不后移,这样可能会出现空指针
                }else {
                    tail.next = temp;
                    tail = tail.next;
                }
            }
            return res;

        }
    }
}
