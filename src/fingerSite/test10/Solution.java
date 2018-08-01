/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package fingerSite.test10;
//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
//思路，经验证，序列依然成斐波那契数列数列一样的规律；
public class Solution {
    public int RectCover(int target) {
        int zeroItem=0;
        int firstItem=1;
        int[] temp=new int[target+1];
        if(target>=2){
            temp[0]=1;
            temp[1]=1;
            for(int i=2;i<=target;i++){
                temp[i]=temp[i-1]+temp[i-2];
            }
            return temp[target];
        }
        else if(target==1){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.print(solution.RectCover(4));
    }
}
