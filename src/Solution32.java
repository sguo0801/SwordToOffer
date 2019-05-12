import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;//别忘了导包.

public class Solution32 {
    public String PrintMinNumber(int[] numbers) {
        String s = "";
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {  //##这里有()
            public int compare(Integer str1, Integer str2) {
                String s1 = str1 + "" + str2;  //##这边要有String
                String s2 = str2 + "" + str1;
                return s1.compareTo(s2);
            }
        });
        for (Integer i : list) {
            s += i;
        }
        return s;

    }
}