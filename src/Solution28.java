//数组出现数字超过一半???牛客网是正确答案
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