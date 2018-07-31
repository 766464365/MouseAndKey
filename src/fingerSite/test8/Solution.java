/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test8;
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。

//思路  斐波那契数列，递归思路，大于2之后的级数，都是前两级之和
public class Solution {
    public int JumpFloor(int target) {

        int[] temp=new int[target+1];
        if(target>2){
            temp[0]=0;
            temp[1]=1;
            temp[2]=2;
            for(int i=3;i<=target;i++){
                temp[i]=temp[i-1]+temp[i-2];
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
        System.out.println(solution.JumpFloor(4));
    }
}

