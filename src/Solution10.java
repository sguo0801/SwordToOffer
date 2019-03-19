public class Solution10 {
    //覆盖矩阵.
    public int RectCover(int target) {  //要注意target<1的情况
        if (target < 1){
            return 0;
        }
        if (target == 1 || target == 2){
            return target;
        }
        return RectCover(target - 1) + RectCover(target - 2);
    }
}