public class Solution2_1 {
    //不需要额外空间,从后往前遍历.
    public String replaceSpace(StringBuffer str) {
        int spacenum = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                spacenum++;
            }
        }
        int oldIndex = str.length() - 1;
        int newLength = str.length() + 2 * spacenum;
        int newIndex = newLength - 1;
        str.setLength(newLength);  //设置新字符串的长度
        for (int i = oldIndex; i >= 0; i--){
            if (str.charAt(i) == ' '){
                str.setCharAt(newIndex--, '0');
                str.setCharAt(newIndex--, '2');
                str.setCharAt(newIndex--, '%');  //注意这里是反过来的字母.
            }else {
                str.setCharAt(newIndex--, str.charAt(i));
            }
        }
        return str.toString();
    }
}