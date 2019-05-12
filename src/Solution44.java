public class Solution44 {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0 ) {  //##先写null 再写length==0;
            return str;
        }
        char[] ch = str.toCharArray();
        int space = 0;
        reverse(ch, 0, ch.length - 1);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                reverse(ch, space, i - 1);
                space = i + 1;
            }
        }
        reverse(ch, space, ch.length - 1);
        return String.valueOf(ch);
    }

    public void reverse(char[] ch, int i, int j) {
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
    }
}