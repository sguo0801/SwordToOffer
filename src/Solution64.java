import java.util.ArrayList; //注意题中是否有导包.
public class Solution64 {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        if(num == null || num.length == 0 || size > num.length || size <=0){
            return new ArrayList<Integer>();  //注意这个小().要写
        }
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = size;
        while(end <= num.length){

            int max = num[start];
            for(int i = start; i < end; i++){
                if(max < num[i]){
                    max = num[i];
                }
            }
            list.add(max);
            start++;
            end++;
        }
        return list;
    }
}