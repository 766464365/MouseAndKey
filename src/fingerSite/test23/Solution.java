/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test23;
//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
// 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
//基本思路，数组的最后一个肯定是根节点，从开始遍历，遇到的最后一个不大于根节点的数，再往后如果出现小于根节点的，则肯定不是
public class Solution {

    public boolean VerifySquenceOfBST(int [] sequence) {
         if(sequence.length>2) {
            int length = sequence.length;
            int root = sequence[length - 1];
            int temp = 0;
            for (int i = 0; i < length; i++) {
                if (sequence[i] >= root) {
                    temp = i;     //第几个
                    break;
                }
            }
            for (int j = temp; j < length; j++) {
                if (sequence[j] < root) {
                    return false;
                }
            }
            int[] front = new int[temp];
            int[] back = new int[length - temp-1];
            for (int h = 0; h < temp; h++) {
                front[h] = sequence[h];
            }
            for (int k = temp; k < length-1; k++) {
                back[k - temp] = sequence[k];
            }
            if(front.length>0&&back.length>0) {
                return VerifySquenceOfBST(front) && VerifySquenceOfBST(back);
            }else if(front.length>0&&back.length<1){
                return VerifySquenceOfBST(front);
            }
            else if(front.length<1&&back.length>0){
                return VerifySquenceOfBST(back);
            }
        }
        else if(sequence.length==0){
             return false;
         }
        return true;
    }
    public static void main(String[] args){
        int [] test={4,6,7,5};
        Solution solution=new Solution();
        System.out.println( solution.VerifySquenceOfBST(test));
//        System.out.println(true&&true);
    }
}























