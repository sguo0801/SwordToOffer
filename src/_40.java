public class _40 {
    public class Solution {
        public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
            int a = 0;
            for (int i : array){
                a ^= i;
            }
            a &= (-a);  //现在是a最低位的1
            for (int i : array){
                if ((i & a) == 0){  //这里是
                    num1[0] ^= i;
                }else {
                    num2[0] ^= i;
                }
            }

        }
    }
}
