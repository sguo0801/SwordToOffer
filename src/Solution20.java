import java.util.Stack;
//包含min函数的栈.
public class Solution20 {
    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();



    public void push(int node) {
        dataStack.push(node);
        if (minStack.empty() || minStack.peek() >= node){
            minStack.push(node);
        }else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if (dataStack.empty()){
            throw new RuntimeException("栈已经空了");
        }else {
            dataStack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        if (minStack.empty()){
            throw new RuntimeException("最小栈空了");
        }
        return minStack.peek();
    }
}