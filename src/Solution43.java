public class Solution43 {
    public String LeftRotateString(String str,int n) {
        if(n <= 0 || str == null || str.length() == 0){  //##要加上str.length()==0.以后就跟str==null写在后面,或者str==null可以不写.
            return str;
        }
        if(n > str.length()){
            n = n & (str.length() - 1);
        }
        char[] ch = str.toCharArray();
        reverse(ch, 0, n - 1);
        reverse(ch, n, ch.length - 1);
        reverse(ch, 0, ch.length - 1);

        return String.valueOf(ch);
    }

    public void reverse(char[] ch, int i, int j){
        while(i < j){
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}