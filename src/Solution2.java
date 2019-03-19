public class Solution2 {
    public String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                stringBuffer.append('%');
                stringBuffer.append('2');
                stringBuffer.append('0');
            }else {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}