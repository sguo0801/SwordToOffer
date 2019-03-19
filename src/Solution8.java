public class Solution8 {
    //跳台阶,递归
    public int JumpFloor(int target) {
        if (target <= 0){
            return -1;
        }else if(target == 1 || target == 2){
            return target;
        }else {
            return JumpFloor(target-1) + JumpFloor(target-2);
        }
    }
}