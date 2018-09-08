/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package fingerSite.test27;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k<=input.length) {
            Arrays.sort(input);
            ArrayList<Integer> result = new ArrayList();
            for (int i = 0; i < k; i++) {
                result.add(input[i]);
            }
            return result;
        }
        else
            return new ArrayList<>();
    }
    public static void main(String [] args){
        Solution solution=new Solution();
        int [] test={1,2,1,5,3,6,3,2};
        solution.GetLeastNumbers_Solution(test,3);
        System.out.println(solution.GetLeastNumbers_Solution(test,3).size());
    }
}
