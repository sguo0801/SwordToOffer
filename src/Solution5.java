import java.util.Stack;
//两个栈实现一个队列
//<分析>：
//
//入队：将元素进栈A
//
//出队：判断栈B是否为空，如果为空，则将栈A中所有元素pop，并push进栈B，栈B出栈；
//
// 如果不为空，栈B直接出栈。就是要把B弄光才从A倒过来入栈.
//
//用两个队列实现一个栈的功能?要求给出算法和思路!
//
//<分析>：
//
//入栈：将元素进队列A
//
//出栈：判断队列A中元素的个数是否为1，如果等于1，则出队列，否则将队列A中的元素   以此出队列并放入队列B，直到队列A中的元素留下一个，然后队列A出队列，再把   队列B中的元素出队列以此放入队列A中。
public class Solution5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);  //其实已经是栈1空了才倒的.
    }

    public int pop() {
        if (stack1.empty() && stack2.empty()){  //栈空和栈为null要区分开.
            throw  new RuntimeException("队列为空。");
        }
        if (stack2.empty()){  //作为可以倒入到栈2的标志.
            while (! stack1.empty()){  //栈1中要倒光.
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }
}

//import java.util.Stack;
//
//public class Solution {
//    Stack<Integer> stack1 = new Stack<Integer>();
//    Stack<Integer> stack2 = new Stack<Integer>();
//
//    public void push(int node) {
//        stack1.push(node);
//    }
//
//    public int pop() {
//        if(stack2.empty() && stack1.empty()){
//            throw new RuntimeException("队列为空!");
//        }
//        if(! stack2.empty()){
//            return stack2.pop();
//        }else {
//            while(! stack1.empty()){
//                stack2.push(stack1.pop());
//            }
//            return stack2.pop();
//        }
//
//    }
//}