/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package fingerSite.test26;

import java.util.*;

//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
// 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int length=array.length;
        int middle=length/2;
        Arrays.sort(array);
        System.out.println(array);
        return middle;
    }

    public static void main(String [] args){
        Solution solution=new Solution();
        int[] a={1,2,3,2,2,2,5,4,2};
        solution.MoreThanHalfNum_Solution(a);
    }
}
