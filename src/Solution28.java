//数组出现数字超过一半???牛客网是正确答案
//采用阵地攻守的思想：
//第一个数字作为第一个士兵，守阵地；count = 1；
//遇到相同元素，count++;
//遇到不相同元素，即为敌人，同归于尽,count--；当遇到count为0的情况，又以新的i值作为守阵地的士兵，继续下去，到最后还留在阵地上的士兵，有可能是主元素。
//再加一次循环，记录这个士兵的个数看是否大于数组一般即可。
public class Solution28 {
    public int MoreThanHalfNum_Solution(int [] array) {
        int length = array.length;
        if (array == null || array.length <= 0){
            return 0;
        }
        int result = array[0];
        int times = 1;
        for (int i = 1; i < length; i++){
            if (times == 0){
                result = array[i];
                times = 1;
            }else {
                if (array[i] == result){
                    times++;
                }else {
                    times--;
                }
            }
        }
        times = 0;
        for (int i = 0; i < length; i++){
            if (result == array[i]){
                times++;
            }
        }
        if (times*2 < length){
            result = 0;
        }
        return result;
    }
}