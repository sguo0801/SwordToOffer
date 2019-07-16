import java.util.Arrays;
public class Solution45 {
    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length != 5){
            return false;
        }
        int zeroNum = 0;
        int spaceNum = 0;
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length - 1; i++){  //##这边是遍历到倒数第二个元素,因为后面有numbers[i+1];
            if(numbers[i] == 0){  //这个过了之后i就变成i+1啦.最后一个是否为0无关紧要,前面已经是4个0啦.必然是ture
                zeroNum++;
            }else if(numbers[i] == numbers[i + 1]){  //##排除连续的两个0;
                return false;
            }else{
                spaceNum += numbers[i + 1] - numbers[i] - 1;
            }
        }
        return zeroNum >= spaceNum;
    }
}