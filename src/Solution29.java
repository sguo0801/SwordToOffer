import java.util.*;
public class Solution29 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        int len = input.length;
        ArrayList<Integer> res = new ArrayList<>();
        if(k > len || k <= 0){  //##注意这个条件
            return res;
        }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(k, new Comparator<Integer>(){  //##基本语法<>泛型都要加上
            public int compare(Integer o1, Integer o2){
                return o2.compareTo(o1);  //降值排序
            }
        });

        for(int i = 0; i < len; i++){
            if(queue.size() < k){
                queue.offer(input[i]);
            }else if(input[i] < queue.peek()){
                Integer temp = queue.poll();
                queue.offer(input[i]);
            }
        }
        for(Integer integer : queue){
            res.add(integer);
        }
        return res;
    }
}