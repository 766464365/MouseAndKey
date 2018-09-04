/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package Test;

import java.util.Scanner;
//思路：遍历的时候，同时判断其上下左右有无数据，并且同时都要大于水的level才行
public class ChuBaoTest2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int floodNum=0;
        int height=scanner.nextInt();   //高度
        int width=scanner.nextInt();    //宽度
        int level=scanner.nextInt();    //水平面高度
        int[][] land=new int[height][width];
        for(int a=0;a<height;a++){
            for(int b=0;b<width;b++){
                land[a][b]=scanner.nextInt();
            }
        }
        //陆地矩阵数据获取完成
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(!judgePD(land,i,j)){
                    if (land[i][j]<=level){
                        floodNum++;
                    }
                }else{
                    if(land[i][j-1]<=level||land[i][j+1]<=level||land[i-1][j]<=level||land[i+1][j]<=level){
                        floodNum++;
                    }

                }
            }
        }
        System.out.println(height*width-floodNum);


    }
    //判断是否有可能属于不为边界点
    public static boolean judgePD(int [][] srcLand,int height,int width){
        int landHeight=srcLand.length;
        int landWidth=srcLand[0].length;
        if(height==0||width==0||height==landHeight-1||width==landWidth-1){
           return false;
        }
        else
            return true;
    }
}
