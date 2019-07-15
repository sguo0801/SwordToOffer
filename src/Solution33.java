import java.util.ArrayList;
public class Solution33 {
    public int GetUglyNumber_Solution(int index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int res = 0;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        if(index <= 0){  //##这边是第几个数,是<=0.第0个也是返回0
            return res;
        }
        list.add(1);  //第一个数是1,所以这边第一个先填0.这里也是get(0).即get(index-1)
        while(list.size() < index){
            int m2  = 2 * list.get(i2);
            int m3  = 3 * list.get(i3);
            int m5  = 5 * list.get(i5);
            int curr = Math.min(m2, Math.min(m3, m5));
            list.add(curr);
            if(curr == m2){//通过如果添加改变索引的方式,进行更新队列
                i2++;
            }
            if(curr == m3){
                i3++;
            }
            if(curr == m5){
                i5++;
            }
        }
        return list.get(index - 1);
    }
}