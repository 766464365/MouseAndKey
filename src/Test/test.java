/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package Test;

import java.io.BufferedInputStream;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        while (sc.hasNext()){
            int numberOfTower=sc.nextInt();
            int numberOfOperate=sc.nextInt();
            int[] height=new int[numberOfTower];
            for(int i=0;i<numberOfTower;i++){
                height[i]=sc.nextInt();
            }
            //思路，在可得到的操作次数范围内，每次都取得组中最高塔以及最低塔，接着将最高的塔的移动一个到最低，最后得出。
            int[] from=new int[numberOfOperate];
            int[] to=new int[numberOfOperate];
            int compare=0,operate=0;
            for(int j=0;j<numberOfOperate;j++){
                int tempBig=height[0],tempSmall=height[0];
                int bigIndex=0,samllIndex=0;
                for(int k=0;k<numberOfTower;k++){
                    if(height[k]>tempBig) {
                        tempBig = height[k];
                        bigIndex=k;
                    }
                    if(height[k]<tempSmall) {
                        tempSmall = height[k];
                        samllIndex=k;
                    }
                }  //得出最大以及最小值以及下标值
                if(bigIndex!=tempSmall){        //进行移动
                    from[j]=bigIndex;
                    to[j]=samllIndex;
                    height[bigIndex]-=1;
                    height[samllIndex]+=1;
                    compare=tempBig-tempSmall-1;        //最小插值
                    operate++;
                }
                else {
                    //都是一样大，故不移动
                    System.out.print(compare);
                    System.out.print(operate);
                    if(operate>1){
                       for(int p=0;p<numberOfOperate;p++){
                           if(from[p]!=0){
                               System.out.print(from[p]);
                               System.out.print(to[p]);
                           }
                       }
                    }
                    break;
                }
            }
        }

    }
}
