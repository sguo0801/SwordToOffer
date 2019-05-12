public class Solution49 {
    public int StrToInt(String str) {
        boolean flag = false;  //##判断是否非法.这里我认为除了0-9和+-其他均为非法.false为默认合法.
        if(str == null || str.trim().equals("")){  //##equals
            flag = true;
            return 0; //##空指针和" "都是非法
        }
        char[] ch = str.trim().toCharArray();
        int symbol = 0;  //##判断正负
        int start = 0;  //判断第一位是否为符号位
        if(ch[0] == '+'){
            start = 1;
        }else if(ch[0] == '-'){
            start = 1;
            symbol = 1;
        }
        int result = 0;
        for(int i = start; i < ch.length; i++){
            if(ch[i] < '0' || ch[i] > '9'){
                flag = true;
                return 0;  //##依旧非法
            }
            int sum = result * 10 + (int)(ch[i] - '0');  //判断溢出
            if((sum - (int)(ch[i] - '0')) / 10 != result){
                flag = true;
                return 0;  //溢出也是非法
            }
            result = result * 10 + (int)(ch[i] - '0');
        }
        return (int)Math.pow(-1, symbol) * result; //-1的0次幂为正1
    }
}