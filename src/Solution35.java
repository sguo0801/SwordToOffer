public class Solution35 {
    public int InversePairs(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int[] copy = new int[array.length];
        int count = fun(array, copy, 0, array.length - 1);  //##不要直接返回方法,定义个变量再返回
        return count;
    }

    public int fun(int[] array, int[] copy, int low, int high) {
        if (low == high) {  //##递归的条件
            return 0;
        }
        int mid = (low + high) >> 1;  //求中间值,要么low+high 再>>1;  要么不用这个正常low+(high-low)/2;


        int countleft = fun(array, copy, low, mid) % 1000000007;  //##递归
        int countright = fun(array, copy, mid + 1, high) % 1000000007;
        int count = 0;
        int i = mid;  //##目的是求每一层最大的count
        int j = high;
        int col = high;
        while (i >= low && j > mid) {  //##目的是求最大的count
            if (array[i] > array[j]) {
                count += j - mid;  //##没有+1,直接加上差值
                copy[col--] = array[i--];
                if (count >= 1000000007) {
                    count %= 1000000007;  //要加取余
                }
            } else {
                copy[col--] = array[j--];  //##复制的数组不能用相同的变量,会减两次
            }
        }


        for (; i >= low; i--) {  //处理好剩下的copy数组的边界.
            copy[col--] = array[i];
        }
        for (; j > mid; j--) {
            copy[col--] = array[j];
        }
        for (int s = low; s <= high; s++) {  //最后要重新排好序.默认逆序对求出后,要整理数组,前面递归就用正常的顺序.并且初始不需要赋值
            array[s] = copy[s];
        }
        return (count + countleft + countright) % 1000000007;
    }
}