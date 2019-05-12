import java.util.LinkedHashMap;
import java.util.Map;

public class Solution54 {
    //Insert one char from stringstream
    private Map<Character, Integer> map = new LinkedHashMap<>();
    public void Insert(char ch) {
        if (map.containsKey(ch)) {
            map.put(ch, map.get(ch) + 1);
        } else {
            map.put(ch, 1);
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (Map.Entry<Character, Integer> set : map.entrySet()) {  //##对linkedhashmap做遍历的过程
            if (set.getValue() == 1) {
                return set.getKey();
            }
        }
        return '#';
    }
}