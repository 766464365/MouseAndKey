/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package Test.chubao;

import java.util.Scanner;
/*
2 3 3
3 3 3
4 3 3

测试数据
 */
//chubao第一题，加入了新的边界盆地判断，即在外围多了一圈无限大的数
public class ChuBaoTest3 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int floodNum=0;
        int height=scanner.nextInt();   //高度
        int width=scanner.nextInt();    //宽度
        int level=scanner.nextInt();    //水平面高度
        int vertualHeight=height+2;
        int vertualWidth=width+2;
        int[][] land=new int[vertualHeight][vertualWidth];
        for(int a=0;a<vertualHeight;a++){
            for(int b=0;b<vertualWidth;b++){
                if(a==0||a==vertualHeight-1||b==0||b==vertualWidth-1){
                    land[a][b]=Integer.MAX_VALUE;
                }
                else
                {
                    land[a][b]=scanner.nextInt();
                }

            }
        }
//        System.out.println(judgePD(land,0,0));
        //陆地矩阵数据获取完成
        for(int i=0;i<vertualHeight;i++){
            for(int j=0;j<vertualWidth;j++){
                if(!judgePD(land,i,j)){     //如果不为边界
                    if (land[i][j]<=level){
                        if(land[i][j-1]<=level||land[i][j+1]<=level||land[i-1][j]<=level||land[i+1][j]<=level){
                            floodNum++;
                        }
                    }
                }
                else{
//                    if(land[i][j-1]<=level||land[i][j+1]<=level||land[i-1][j]<=level||land[i+1][j]<=level){
//                        floodNum++;
//                    }

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
            return true;
        }
        else
            return false;
    }
}
