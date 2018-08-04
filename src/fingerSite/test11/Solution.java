/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package fingerSite.test11;
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
public class Solution {
<<<<<<< HEAD
//    public int NumberOf1(int n) {
//
//    }
=======
    public int NumberOf1(int n) {
        String str=String.valueOf(Integer.toBinaryString(n));
        char[]  chars=str.toCharArray();
        int num=0;
        for (char x:chars
                ) {
            if(x=='1'){
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args){
        System.out.println(Integer.toBinaryString(13));
        Solution solution=new Solution();
        System.out.println(solution.NumberOf1(13));
    }
>>>>>>> 5923df964b39fac72479a6fc70df4b2cbde45557
}

