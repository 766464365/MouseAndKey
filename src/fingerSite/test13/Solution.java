/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test13;

import java.util.Stack;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
//所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class Solution {

    //使用数组的方法
    public void reOrderArrayByStack(int [] array) {
        Stack<Integer> oddNumber=new Stack<>();
        Stack<Integer> evenNumber=new Stack<>();
        for (int x:array
             ) {
            if(x%2==0){
                //为偶数
                evenNumber.push(x);
            }
            else
            {
                //为奇数
                oddNumber.push(x);
            }
        }
        for(int i=0;i<array.length;i++){
            if(!oddNumber.isEmpty()){
                array[i]=oddNumber.pop();
            }
            else
                array[i]=evenNumber.pop();
        }

    }
    public void reOrderArray(int [] array) {
        int odd = 0,even = 0;
        for (int x:array
             ) {
            if(x%2==0){
                even++;
            }
            else
                odd++;
        }
        int[] oddNumber=new int[odd];
        int[] evenNumber=new int[even];
        int oddIndex=0,evenIndex=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                evenNumber[evenIndex]=array[i];
                evenIndex++;
            }
            else{
                oddNumber[oddIndex]=array[i];
                oddIndex++;
            }
        }
        for(int i=0;i<oddNumber.length;i++){
            array[i]=oddNumber[i];
        }
        for(int i=0;i<evenNumber.length;i++){
            array[i+oddNumber.length]=evenNumber[i];
        }

    }

    public static void main(String[] args){

    }
}
