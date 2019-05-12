import java.util.ArrayList;

public class Solution42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array == null || array.length < 2) {
            return list;
        }
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                list.add(array[i]);
                list.add(array[j]);  //##只要命中了这个条件,直接返回list.
                if (list != null) {
                    return list;
                }
            } else if (array[i] + array[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
        return list;
    }
}