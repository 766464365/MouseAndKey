/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test5;

import java.util.Stack;

//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack1.isEmpty()){
            System.out.println("队列内无元素");
            return -1;
        }
        else
        {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
            int result= stack2.pop();
            while(!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            return result;
        }

    }
    public static void main(String[] args){
        Solution solution=new Solution();

        //["PSH1","PSH2","PSH3","POP","POP","PSH4","POP","PSH5","POP","POP"]
        solution.push(1);
        solution.push(2);
        solution.push(3);
        System.out.println(solution.pop());
        System.out.println(solution.pop());
        solution.push(4);
        System.out.println(solution.pop());
        solution.push(5);
        System.out.println(solution.pop());
        System.out.println(solution.pop());


    }

}
