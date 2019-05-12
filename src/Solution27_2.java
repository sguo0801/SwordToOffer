//import java.util.ArrayList;
//import java.util.TreeSet;

//import java.util.*;
//public class Solution27_2 {
//
//
//    public class Solution {
//
//        public ArrayList<String> Permutation(String str) {
//            ArrayList<String> result = new ArrayList<String>() ;
//            if(str==null || str.length()==0) { return result ; }
//
//            char[] chars = str.toCharArray() ;
//            TreeSet<String> temp = new TreeSet<>() ;
//            Permutation(chars, 0, temp);
//            result.addAll(temp) ;
//            return result ;
//        }
//
//        public void Permutation(char[] chars, int begin, TreeSet<String> result) {
//            if(chars==null || chars.length==0 || begin<0 || begin>chars.length-1) { return ; }
//            if(begin == chars.length-1) {
//                result.add(String.valueOf(chars)) ;
//            }else {
//                for(int i=begin ; i<=chars.length-1 ; i++) {
//                    swap(chars, begin, i) ;
//
//                    Permutation(chars, begin+1, result);
//
//                    swap(chars, begin, i) ;
//                }
//            }
//        }
//
//        public void swap(char[] x, int a, int b) {
//            char t = x[a];
//            x[a] = x[b];
//            x[b] = t;
//        }
//
//    }
//}
//链接：https://www.nowcoder.com/questionTerminal/fe6b651b66ae47d7acce78ffdd9a96c7
//来源：牛客网
//
//public ArrayList<String> Permutation(String str){
//
//        ArrayList<String> list = new ArrayList<String>();
//        if(str!=null && str.length()>0){
//            PermutationHelper(str.toCharArray(),0,list);
//            Collections.sort(list);  //这里是排序
//        }
//        return list;
//    }
//    private void PermutationHelper(char[] chars,int i,ArrayList<String> list){
//        if(i == chars.length-1){
//            list.add(String.valueOf(chars));
//        }else{
//            Set<Character> charSet = new HashSet<Character>();
//            for(int j=i;j<chars.length;++j){
//                if(j==i || !charSet.contains(chars[j])){
//                    charSet.add(chars[j]);
//                    swap(chars,i,j);
//                    PermutationHelper(chars,i+1,list);
//                    swap(chars,j,i);
//                }
//            }
//        }
//    }
//
//    private void swap(char[] cs,int i,int j){
//        char temp = cs[i];
//        cs[i] = cs[j];
//        cs[j] = temp;
//    }



import java.util.*;
public class Solution27_2 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        if (str.length() > 0 && str != null) {

            char[] ch = str.toCharArray();
            permutation(ch, 0, list);
            Collections.sort(list);
        }
        return list;
    }

    public void permutation(char[] ch, int i, ArrayList<String> list) {
        if (i == ch.length - 1) {
            if (!list.contains(new String(ch))) {
                list.add(String.valueOf(ch));
                return;
            }
        } else {
            for (int j = i; j < ch.length; j++) {
                swap(ch, j, i);
                permutation(ch, i + 1, list);
                swap(ch, j, i);
            }
        }
    }


    public void swap(char[] ch, int i, int j) {
        if (i != j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }
    }
}
