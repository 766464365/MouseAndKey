/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test9;
//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
//斐波契利数列  但是是累加；
public class Solution {
    public int JumpFloorII(int target) {

        int[] temp=new int[target+1];
        if(target>2){
            temp[0]=0;
            temp[1]=1;
            temp[2]=2;
            for(int i=3;i<=target;i++){
                int val=0;
                for(int j=target;j>=0;j--){
                    val+=temp[target-1];
                }
                return val;
            }
            return temp[target];
        }
        else if(target==2){
            return 2;
        }
        else if(target==1){
            return 1;
        }
        else
            return 0;
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.JumpFloorII(3));
    }
}
