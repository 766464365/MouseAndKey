/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package Test.chubao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
//chubao第一题，通过率57，原因在于没有考虑边界盆地。

public class ChuBaoTest {
    //操作符
    private static LinkedList<String> operatorsChar=new LinkedList<>();
    //输出
    private static LinkedList<String> output=new LinkedList<>();
    //后缀表达式
    private static StringBuilder reverse=new StringBuilder();

    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<>();
        String test;
        Scanner scanner=new Scanner(System.in);
        test=scanner.next();
        for (char x:test.toCharArray()
             ) {
            list.add(String.valueOf(x));
        }
        transferToPostfix(list);
        scanner.close();

    }
    //中转后缀表达式
    private static void transferToPostfix(LinkedList<String> list){
        Iterator<String> it=list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            if (isOperator(s)) {
                if (operatorsChar.isEmpty()) {
                    operatorsChar.push(s);
                }
                //读入不为操作符并且优先级高与栈顶，压入
                else {
                    if (priority(operatorsChar.peek())<=priority(s)&&!s.equals(")")) {
                        operatorsChar.push(s);
                    }
                    else if(!s.equals(")")&&priority(operatorsChar.peek())>priority(s)){
                        while (operatorsChar.size()!=0&&priority(operatorsChar.peek())>=priority(s)
                                &&!operatorsChar.peek().equals("(")) {
                            if (!operatorsChar.peek().equals("(")) {
                                String operator=operatorsChar.pop();
                                reverse.append(operator).append(" ");
                                output.push(operator);
                            }
                        }
                        operatorsChar.push(s);
                    }
                    //读取到），弹出栈顶中（之前的操作符
                    else if (s.equals(")")) {
                        while (!operatorsChar.peek().equals("(")) {
                            String operator=operatorsChar.pop();
                            reverse.append(operator).append(" ");
                            output.push(operator);
                        }
                        //弹出"("
                        operatorsChar.pop();
                    }
                }
            }
            //读入的不为操作符
            else {
                reverse.append(s).append(" ");
                output.push(s);
            }
        }
        if (!operatorsChar.isEmpty()) {
            Iterator<String> iterator=operatorsChar.iterator();
            while (iterator.hasNext()) {
                String operator=iterator.next();
                reverse.append(operator).append(" ");
                output.push(operator);
                iterator.remove();
            }
        }
        getResult();
    }

    //计算结果
    private static void getResult(){
        LinkedList<String> mList=new LinkedList<>();
        String[] postStr=reverse.toString().split(" ");
        for (String s:postStr) {
            if (isOperator(s)){
                if (!mList.isEmpty()){
                    int num1=Integer.valueOf(mList.pop());
                    int num2=Integer.valueOf(mList.pop());
                    if (s.equals("/")&&num1==0){
                        return;
                    }
                    int newNum=cal(num2,num1,s);
                    mList.push(String.valueOf(newNum));
                }
            }
            else {
                //压入数字
                mList.push(s);
            }
        }
        if (!mList.isEmpty()){
            System.out.println(mList.pop());
        }
    }

    //判断是否操作符
    private static boolean isOperator(String oper){
        if (oper.equals("+")||oper.equals("-")||oper.equals("/")||oper.equals("*")
                ||oper.equals("(")||oper.equals(")")) {
            return true;
        }
        return false;
    }
    //设置操作符的优先级    加减法在先
    private static int priority(String s){
        switch (s) {
            case "+":return 2;
            case "-":return 2;
            case "*":return 1;
            case "/":return 1;
            default :return 0;
        }
    }

    private static int cal(int num1,int num2,String operator){
        switch (operator){
            case "+":return num1+num2;
            case "-":return num1-num2;
            case "*":return num1*num2;
            case "/":return num1/num2;
            default :return 0;
        }
    }
}
