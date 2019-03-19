public class Solution23 {
    //二叉搜索树的后序遍历序列
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0){
            return false;  //如果序列为空,则不是任何二叉搜索树的后序遍历.空树不计.
        }
        return isErCha(sequence, 0, sequence.length - 1);
    }

    public boolean isErCha(int[] sequence, int start, int end){
        if (start >= end){
            return true;  //这边是比较索引!!索引初始都跟索引末尾重合啦,说明,递归到目前没有任何问题,则返回true
        }
        int mid = start;
        for (; mid < end && sequence[mid] < sequence[end]; mid++){
        }  //这边是找到左右两个子树的分界点.此时mid为右子树的第一个节点.
        for (int i = mid; i < end; i++){
            if (sequence[i] < sequence[end]){
                return false;  //只要后面分界后的右子树中有比根节点小的,即返回false.
            }
        }
        //看分界后的左右两子树.递归找是否有false,直到start=end.
        return isErCha(sequence, 0, mid - 1) && isErCha(sequence, mid, end - 1);
    }
}