public class Solution8_1 {
    //跳台阶,迭代方法.
    public int JumpFloor(int target) {
        if (target == 1 || target == 2){
            return target;
        }
        int numJump = 0;
        int numBef2 = 1;  //前两个台阶为1种
        int numBef1 = 2;  //前一个台阶为2种(现在是第三级台阶)
        for (int i = 3; i <= target; i++){
            numJump = numBef1 + numBef2;
            numBef2 = numBef1;
            numBef1 = numJump;
        }
        return numJump;

    }
}