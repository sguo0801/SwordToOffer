import java.util.Stack;

public class _21 {
    public class Solution {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            Stack<Integer> stack = new Stack<>();
            int index = 0;
            for (int i = 0; i < pushA.length; i++){
                stack.push(pushA[i]);
                while (!stack.empty() && stack.peek() == popA[index]){
                    stack.pop();
                    index++;
                }
            }
            return stack.empty();

        }
    }
}
