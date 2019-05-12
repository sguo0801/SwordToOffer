import java.util.LinkedHashMap;
public class Solution34 {
    public int FirstNotRepeatingChar(String str) {
        int res = -1;
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            int times = 1;
            if(map.containsKey(ch[i])){  //##这边是包含这个KEY,所以方法是containsKey.
                map.put(ch[i], ++times);
            }else{
                map.put(ch[i], times);
            }
        }
        for(int i = 0; i < ch.length; i++){
            if(map.get(ch[i]) == 1){
                return i;
            }
        }
        return res;
    }
}