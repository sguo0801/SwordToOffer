import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class _64 {
    public class Solution {
        public ArrayList<Integer> maxInWindows(int [] num, int size)
        {
            ArrayList<Integer>  res = new ArrayList<>();
            if (num == null || num.length == 0 || size > num.length || size <= 0){  //跟code里面不一样在,边界条件要考虑size的情况.
                return res;
            }
            LinkedList<Integer> queue = new LinkedList<>();
            for (int i = 0; i < num.length; i++){
                while (! queue.isEmpty() && queue.peek() < i - size + 1){
                    queue.poll();
                }
                while (! queue.isEmpty() && num[queue.peekLast()] < num[i]){
                    queue.pollLast();
                }
                queue.offer(i);
                if(i >= size - 1)
                    res.add(num[queue.peek()]);
            }
            return res;

        }
    }
}
