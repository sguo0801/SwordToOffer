public class Solution9 {
    //变态跳青蛙,数学归纳之后找规律后递归
    public int JumpFloorII(int target) {
        if (target == 1 || target == 0){
            return target;
        }
        return 2*JumpFloorII(target - 1);
    }
}
