import java.util.ArrayList;
import java.util.Collections;

public class _27 {
    public class Solution {
        public ArrayList<String> Permutation(String str) {
            ArrayList<String> res = new ArrayList<>();
            if (str != null && str.length() > 0){
                char[] ch = str.toCharArray();
                dps(res, ch, 0);
                Collections.sort(res);
            }
            return res;

        }

        private void dps(ArrayList<String> res, char[] ch, int i){
            if (i == ch.length - 1){
                if (! res.contains(new String(ch))){  //###去重
                    res.add(new String(ch));
                }

            }else {
                for (int j = i; j < ch.length; j++){
                    swap(ch, i, j);
                    dps(res, ch, i+1);
                    swap(ch, i, j);
                }
            }

        }

        private void swap(char[] ch, int a, int b){
            if(a != b){
                char x = ch[a];
                ch[a] = ch[b];
                ch[b] = x;
            }
        }
    }
}
