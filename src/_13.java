public class _13 {
    public class Solution {
        public void reOrderArray(int [] array) {
            if (array == null || array.length == 0){
                return;
            }
            int len = array.length;
            //从前往后,就是插入排序.
                for (int j = 1; j < array.length; j++){
                    int temp = array[j];
                    int i = j;
                    while (i > 0 && (temp & 1) == 1 && (array[i - 1] & 1) == 0){
                        //注意上面是i > 0;因为后面有i - 1.所以不能为0.
                        array[i] = array[i - 1];
                        i--;
                    }
                    array[i] = temp;
                }


        }
    }
}
