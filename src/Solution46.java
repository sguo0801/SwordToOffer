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
//##不是很懂!!!!!!!!
public class Solution46
    //最终的递推关系式为
        //f(1,m) = 0;                        (n=1)
        //f(n,m)=(f(n-1,m)+m)%n; （n>1）
{
    public int LastRemaining_Solution(int n, int m)
    {
        if(n==0||m==0)return -1;
        int s=0;
        for(int i=2;i<=n;i++)  //这里的i是指小孩的个数,要是只有一个小孩即i=1,那最后出列的就是它本身,如果是从1开始编号,这里结果要+1.
        {
            s=(s+m)%i;
        }
        return s ;
    }
}