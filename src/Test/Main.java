/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package Test;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(new BufferedInputStream(System.in));
        while(scanner.hasNext()){
            int number=scanner.nextInt();
            int[] appleList=new int[number];
            for(int i=0;i<number;i++){
                appleList[i]=scanner.nextInt();
            }
            int askTime=scanner.nextInt();
            int[] askList=new int[askTime];
            for(int j=0;j<askTime;j++){
                askList[j]=scanner.nextInt();
            }
            //开始处理;     ac不过  显示超时。。。应该是下面的while费时了
            for(int k=0;k<askTime;k++){
                int question=askList[k];
                int nowsApple=appleList[0];
                int nowsIndex=0;
                if(question<nowsApple){
                    System.out.println(nowsIndex+1);
                }
                else {
                    while (question>nowsApple){
                        nowsIndex++;
                        nowsApple+=appleList[nowsIndex];
                    }
                    System.out.println(nowsIndex+1);
                }
            }

        }
    }
}
