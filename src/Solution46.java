//import java.util.LinkedList;
//public class Solution46 {
//    public int LastRemaining_Solution(int n, int m) {
//        LinkedList<Integer> list = new LinkedList<>();
//        for(int i = 0; i < n; i++){
//            list.offer(i);
//        }
//        int bt = 0;
//        while(list.size() > 1){
//            bt = (bt + m - 1) & (list.size() - 1);
//            list.remove(bt);
//        }
//        return list.size() == 1 ? list.peek() : -1;
//    }
//}
//不是很懂!!!!!!!!
public class Solution46
{
    public int LastRemaining_Solution(int n, int m)
    {
        if(n==0||m==0)return -1;
        int s=0;
        for(int i=2;i<=n;i++)
        {
            s=(s+m)%i;
        }
        return s ;
    }
}