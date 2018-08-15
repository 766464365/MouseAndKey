/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test20;
import java.util.Stack;


public class Solution {
    Stack<Integer> mStack =new Stack<>();
    Stack<Integer> temp=new Stack<>();
    public void push(int node) {
        if(mStack.isEmpty()){
            //为空时
            mStack.push(node);
        }
        else
        {
            //不为空时 进行比较
            if(!temp.isEmpty()){
                temp.clear();
            }
            while(node>mStack.peek()){
                temp.push(mStack.peek());
                mStack.pop();
                if(mStack.isEmpty())
                    break;
            }
            mStack.push(node);
            while(!temp.isEmpty()){
                mStack.push(temp.pop());
            }

        }
    }
//["PSH3","MIN","PSH4","MIN","PSH2","MIN","PSH3","MIN","POP","MIN","POP","MIN","POP","MIN","PSH0","MIN"]
    public void pop() {
        mStack.pop();
    }

    public int top() {
        return mStack.peek();
    }

    public int min() {
        return mStack.peek();
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        solution.push(3);
        System.out.println(solution.min());
        solution.push(4);
        System.out.println(solution.min());
        solution.push(2);
        System.out.println(solution.min());
        solution.push(3);
        System.out.println(solution.min());
        solution.pop();
        System.out.println(solution.min());
        solution.pop();
        System.out.println(solution.min());
        solution.pop();
        System.out.println(solution.min());
        solution.push(0);
        System.out.println(solution.min());
    }
}
