/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test21;
import java.util.ArrayList;
//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
// 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）

public class Solution {
    ArrayList<Integer> temp=new ArrayList<>();
//    public boolean IsPopOrder(int [] pushA,int [] popA) {
//        int length=pushA.length;
//        for(int i=0;i<length;i++){
//            temp.add(pushA[i]);
//
//            while (popA[i]==temp.get(temp.size()-1)){
//                temp.remove(temp.size()-1);
//            }
//        }
//
//
//    }
    public static void main(String[] args){
        Solution solution=new Solution();
        int[] pushA={1,2,3,4,5};
        int[] popA={5,4,3,2,1};
        int[] aa={2,3,4,1,2};
//        System.out.println(solution.IsPopOrder(pushA,popA));
    }
}
















































