import java.util.*;
//字符串的排列????牛客网是可以编程过得
/**
 * 1、递归算法
 * <p>
 * 解析：http://www.cnblogs.com/cxjchen/p/3932949.html  (感谢该文作者！)
 * <p>
 * 对于无重复值的情况
 * <p>
 * 固定第一个字符，递归取得首位后面的各种字符串组合；
 * 再把第一个字符与后面每一个字符交换，并同样递归获得首位后面的字符串组合； *递归的出口，就是只剩一个字符的时候，递归的循环过程，就是从每个子串的第二个字符开始依次与第一个字符交换，然后继续处理子串。
 * <p>
 * 假如有重复值呢？
 * *由于全排列就是从第一个数字起，每个数分别与它后面的数字交换，我们先尝试加个这样的判断——如果一个数与后面的数字相同那么这两个数就不交换了。
 * 例如abb，第一个数与后面两个数交换得bab，bba。然后abb中第二个数和第三个数相同，就不用交换了。
 * 但是对bab，第二个数和第三个数不 同，则需要交换，得到bba。
 * 由于这里的bba和开始第一个数与第三个数交换的结果相同了，因此这个方法不行。
 * <p>
 * 换种思维，对abb，第一个数a与第二个数b交换得到bab，然后考虑第一个数与第三个数交换，此时由于第三个数等于第二个数，
 * 所以第一个数就不再用与第三个数交换了。再考虑bab，它的第二个数与第三个数交换可以解决bba。此时全排列生成完毕！
 */
public class Solution27 {
    public static ArrayList<String> Permutation(String str) {
        char[] arr = str.toCharArray();
        List<char[]> list = new ArrayList<>();
        all(arr, 0, arr.length - 1, list);
        Collections.sort(list, (o1, o2) -> String.valueOf(o1).compareTo(String.valueOf(o2)));
        ArrayList<String> res = new ArrayList<>();
        for (char[] c : list) {
            if (!res.contains(String.valueOf(c)))
                res.add(String.valueOf(c));
        }
        return res;
    }

    //注意要换完为之，因为每换一次可以去掉头部一个数字，这样可以避免重复
    public static void all(char[] arr, int cur, int end, List<char[]> list) {
        if (cur == end) {
//            System.out.println(Arrays.toString(arr));
            list.add(Arrays.copyOf(arr, arr.length));
        }
        for (int i = cur; i <= end; i++) {
            //这里的交换包括跟自己换，所以只有一轮换完才能确定一个结果
            swap(arr, cur, i);
            all(arr, cur + 1, end, list);
            swap(arr, cur, i);
        }
    }

    public static void swap(char[] arr, int i, int j) {
        if (i > arr.length || j > arr.length || i >= j) return;
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}