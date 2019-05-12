import java.util.ArrayList;
public class Solution51 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        for(int i = 1; i < A.length; i++){
            B[i] = B[i - 1] * A[i - 1];  //##这边是B与A的索引不同,画图即可知道
        }
        int temp = 1;
        for(int j = A.length - 2; j >= 0; j--){
            temp *= A[j + 1];  //##用temp代表原右边的乘积和,因为左边已经B[i]有值啦,最后再B[j]表示两边乘积.
            B[j] = B[j] * temp;  //右边的B[j]是下三角的乘积值.
        }
        return B;

    }
}