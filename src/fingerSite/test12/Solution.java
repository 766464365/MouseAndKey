/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test12;
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
public class Solution {
    public double Power(double base, int exponent) {
        if(base>=0){
            if(exponent>0) {
                double val = 1;
                for (int i = 0; i < exponent; i++) {
                    val *= base;
                }
                return val;
            }
            else
                if (exponent==0)
                    return 1;
            else
                if(exponent<0){
                    double va1=1;
                    for(int i=0;i<Math.abs(exponent);i++){
                        va1*=1/base;
                    }
                    return va1;
                }
                else
                    return -10086;
        }
        else
        {
            if(exponent>0) {
                double val = 1;
                for (int i = 0; i < exponent; i++) {
                    val *= Math.abs(base);
                }
                if (exponent % 2 == 0) {
                    return val;
                } else
                    return -val;
            }else
                if(exponent==0)
                    return 1;
            else
                if(exponent<0){
                    double val = 1;
                    for (int i = 0; i < Math.abs(exponent); i++) {
                        val *= 1/Math.abs(base);
                    }
                    if (exponent % 2 == 0) {
                        return val;
                    } else
                        return -val;
                }
                else
                    return -10086;
        }
    }
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.Power(-2,-2));
    }
}
