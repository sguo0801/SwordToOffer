public class Solution13 {
    //调整数组顺序使奇数位与偶数前面
    public void reOrderArray(int [] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int i = 0, j;
        while (i < array.length) {  //是大循环
            while (i < array.length && !isEven(array[i])) {
                i++;
            }
            //已经找到第一个偶数啦.
            j = i + 1;
            while (j < array.length && isEven(array[j])) {
                j++;
            }
            //已经找到第一个偶数后面的第一个奇数.
            if (j < array.length) {
                int temp = array[j];
                for (int j2 = j - 1; j2 >= i; j2--) { //这边开始将这个奇数从后往前移动,通过两两交换的方法.
                    array[j2 + 1] = array[j2];
                }
                array[i++] = temp;
            }else {
                break;  //说明偶数后面没有奇数.直接跳出while循环.
            }
        }
    }
    private boolean isEven(int a){
        if (a%2 == 0){
            return true;
        }
        return false;
    }
}