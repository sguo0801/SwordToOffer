//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution40 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array.length == 2){
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }
        int result = 0;
        for(int i = 0; i < array.length; ++i){
            result ^= array[i];
        }
        int index = findFirst1(result);
        for(int i = 0; i < array.length; ++i){
            if(isBit1(array[i], index)){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }
        return;
    }

    public int findFirst1(int result){
        int index = 0;
        while((result & 1) != 1){
            index++;
            result >>= 1;
        }
        return index;
    }

    public boolean isBit1(int target, int index){
        if(((target >>= index) & 1) == 1){
            return true;
        }
        return false;
    }
}