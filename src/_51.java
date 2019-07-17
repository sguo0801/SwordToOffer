public class _51 {
    public class Solution {
        public int[] multiply(int[] A) {
            int[] res = new int[A.length];
            int p = 1;
            int q = 1;
            for (int i = 0; i < A.length; i++){
                res[i] = p;
                p *= A[i];
            }
            for (int i = A.length - 1; i > 0; i--){  //##临界条件是i > 0
                q *= A[i];
                res[i - 1] *= q;  //往回算的时候,上三角的最下面一行不再计算,这里直接是[n-2]行.
            }
            return res;

        }
    }
}
