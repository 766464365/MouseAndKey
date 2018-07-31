/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test7;

import java.util.ArrayList;
import java.util.List;

//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
//n<=39
public class Solution {
    public int FibonacciByArray(int n) {
        int zeroItem=0;
        int firstItem=1;
        List<Integer> list=new ArrayList<>();
        if(n>2){
            list.add(0);
            list.add(1);
            for(int i=2;i<=n;i++){
                list.add(list.get(i-1)+list.get(i-2));
            }
            return list.get(n);
        }
        else if(n==1){
            return 1;
        }
        else {
            return 0;
        }
    }
    public int Fibonacci(int n) {
        int zeroItem=0;
        int firstItem=1;
        int[] temp=new int[n+1];
        if(n>=2){
            temp[0]=0;
            temp[1]=1;
            for(int i=2;i<=n;i++){
                temp[i]=temp[i-1]+temp[i-2];
            }
            return temp[n];
        }
        else if(n==1){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.Fibonacci(2));

    }
}
