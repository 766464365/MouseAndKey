/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package Test.tx;


import java.util.Scanner;

public class TXtest {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int list[]=new int[num];
        if(num>0){
            for(int i=0;i<num;i++){
                list[i]=scanner.nextInt();
            }
            int[] sortList=popSort(list);     //排序完
            boolean ableNiuniu=true;
            int niuniu=0,yangyang=0;
            for(int j=0;j<num;j++){
                if(ableNiuniu){
                    niuniu+=sortList[j];
                    ableNiuniu=false;
                }
                else{
                    yangyang+=sortList[j];
                    ableNiuniu=true;
                }
            }
            System.out.println(niuniu-yangyang);
        }
        else
            System.out.println(0);

    }
    //从小到大排序
    public static int[] selectionSort(int[] targetArray) {
        int n = targetArray.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            for (int j = i + 1; j < n; j++) {
                if (targetArray[j] < targetArray[k]) {
                    k = j;
                }
            }
            if (k > i) {
                int tmp = targetArray[i];
                targetArray[i] = targetArray[k];
                targetArray[k] = tmp;
            }
        }
        return targetArray;
    }
    //从大到小
    public static int[] popSort(int[] a){
        int n=a.length;
        for(int j=n;n>0;n--) {
            for (int i = 0; i < j - 1; i++) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        return a;
    }
}
