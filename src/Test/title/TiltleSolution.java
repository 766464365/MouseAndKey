/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package Test.title;

import java.util.*;

//用set，将认识的人都放在一起
/*
input:
10
0
5 3 0
8 4 0
9 0
9 0
3 0
0
7 9 0
0
9 7 0

output:
2
 */
public class TiltleSolution {


    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Set<Integer> unSetQueue=new HashSet<>();
        Set<Integer> haveSetQueue=new HashSet<>();
        int totalPeople=scanner.nextInt();
        for(int j=0;j<totalPeople;j++){
            unSetQueue.add(j+1);        //将所有人放进一个未分配队列
        }
        int groupNum=0;
        if(totalPeople>0){
            for(int i=0;i<totalPeople;i++){
                if(unSetQueue.contains(i+1)){       //它属于未分配的 才进行设置
                    groupNum++;
                    unSetQueue.remove(i+1);
                    while(scanner.hasNextInt()){
                        if(scanner.nextInt()==0){
                            break;
                        }else
                            unSetQueue.remove(scanner.nextInt()+1);
                    }
                }

            }
            System.out.println(groupNum);
        }

    }
}
