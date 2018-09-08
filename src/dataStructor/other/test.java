/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package dataStructor.other;

public class test {
    public static void main(String[] args){
        String str = "1+2*3";  //其后缀表达式为325-6*3/+

        //调用方法：中缀表达式转成后缀表达式
        System.out.println(StringToArithmetic.infixToSuffix(str));

        //调用方法：给出一个算术表达式（中缀表达式），得到计算结果
        System.out.println(StringToArithmetic.stringToArithmetic(str));
    }

}
