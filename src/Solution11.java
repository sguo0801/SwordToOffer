public class Solution11 {
    //求二进制中1的个数,用1的二进制,然后往左移,一次跟数字做位与运算.
    public int NumberOf1(int n) {
        int flag = 1;
        int count = 0;
        while (flag != 0){  //不是很懂这个条件??
            if ((n & flag) != 0){
                count++;
            }
            flag = flag << 1;
        }
        return count;

    }
}