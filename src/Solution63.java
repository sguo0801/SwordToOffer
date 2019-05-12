import java.util.Comparator; //##别忘了写!!
import java.util.PriorityQueue;

public class Solution63 {
    int count = 0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();//默认11,下面是设置两个相同,也可以>11
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(11, new Comparator<Integer>() {//Comparator后面也有<Integer>().而且要导包!!
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });

    public void Insert(Integer num) {
        if ((count & 1) == 0) {//为偶数个时,再插则放入小根堆.
            maxHeap.offer(num);
            int temp = maxHeap.poll();
            minHeap.offer(temp);
        } else {
            minHeap.offer(num);
            int temp = minHeap.poll();
            maxHeap.offer(temp);
        }
        count++;
    }

    public Double GetMedian() {
        if ((count & 1) == 1) {//说明为奇数,最后一次多插了一下小根堆
            return new Double(minHeap.peek());
        } else {
            return new Double((minHeap.peek() + maxHeap.peek())) / 2; // Double类型不能用位运算>>1.只能最后/2
        }
    }
}