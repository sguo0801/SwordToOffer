import java.util.ArrayList;
//找和为sum的连续子序列
public class Solution41 {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        //两个起点，相当于动态窗口的两边，根据其窗口内的值的和来确定窗口的位置和大小
        int low = 1;  //因为值是从1开始的
        int high = 2;
        while (low < high) {
            int cur = (low + high) * (high - low + 1) >> 1;
            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    list.add(i);
                }
                low++;
                result.add(list);
            } else if (cur < sum) {
                high++;
            } else {
                low++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println( FindContinuousSequence(100));

    }
}