import java.util.Comparator;
import java.util.PriorityQueue;

public class _63 {
    public class Solution {

        int count = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });
        public void Insert(Integer num) {

            if ((count & 1) == 0){
                maxHeap.offer(num);
                int temp = maxHeap.poll();
                minHeap.offer(temp);
            }else {
                minHeap.offer(num);
                int temp = minHeap.poll();
                maxHeap.offer(temp);
            }
            count++;

        }

        public Double GetMedian() {
            if ((count & 1) == 1){
                return (double)minHeap.peek();
            }else {
                return (double)(minHeap.peek() + maxHeap.peek()) / 2;
            }

        }


    }
}
