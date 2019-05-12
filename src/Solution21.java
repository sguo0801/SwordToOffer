import java.util.ArrayList;
import java.util.Stack;
//栈的压入,弹出序列
public class Solution21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;  // 弹出序列的索引,每匹配一次则右移.
        for (int i = 0; i < pushA.length; i++){
            stack.push(pushA[i]);  //先压栈.
            while (! stack.empty() && stack.peek() == popA[popIndex]){  //只有辅助栈不为空,且栈顶元素与弹出序列的索引位相同时,进行弹出,并且索引后移
                stack.pop();
                popIndex++;
            }
        }
        return stack.empty();  //如果为空,则说明是该栈的弹出顺序.
    }
}
