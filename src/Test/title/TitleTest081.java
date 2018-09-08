/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package Test.title;

import java.io.BufferedInputStream;
import java.util.Scanner;

/*
input:
5
1 2 3 3 5
3
1 2 1
2 4 5
3 5 3

output:
1
0
2

样例解释:
有5个用户，喜好值为分别为1、2、3、3、5，
第一组询问对于标号[1,2]的用户喜好值为1的用户的个数是1
第二组询问对于标号[2,4]的用户喜好值为5的用户的个数是0
第三组询问对于标号[3,5]的用户喜好值为3的用户的个数是2
 */
public class TitleTest081 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int userNum=scanner.nextInt();
        int askList;
        int[] likeList=new int[userNum];
        for(int i=0;i<5;i++){
            likeList[i]=scanner.nextInt();
        }
        if(scanner.hasNextInt()){
            askList=scanner.nextInt();
            for(int j=0;j<askList;j++){
                int beginIndex=scanner.nextInt();
                int endIndex=scanner.nextInt();
                int targetLike=scanner.nextInt();
                int result=0;
                if(beginIndex>0) {
                    for (int x = beginIndex - 1; x <= endIndex - 1; x++) {
                        if (likeList[x] == targetLike) {
                            result++;
                        }
                    }
                    System.out.println(result);
                }
            }
        }
    }
}
