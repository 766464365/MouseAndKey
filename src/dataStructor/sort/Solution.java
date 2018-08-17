/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package dataStructor.sort;

import java.util.Scanner;
//alitest
public class Solution {
    /** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    public static int[] selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            // 找出最小值的小标
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            // 将最小值放到排序序列末尾
            if (k > i) {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
        }
        return a;
    }
    static int maxWorkinghourGap(int[] workinghours) {
        int[] sortArray =selectionSort(workinghours);
        int length=sortArray.length;
        int distance=0;
        if(length>1){
            for(int i=0;i<length-1;i++){
                int tempDistance=sortArray[i+1]-sortArray[i];
                if(tempDistance>distance){
                    distance=tempDistance;
                }

            }
            return distance;
        }
        else
            return 0;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String inputData;
        try {
            inputData = in.nextLine();
        } catch (Exception e) {
            return;
        }

        String[] strs = inputData.split(",");
        int[] workinghours = new int[strs.length];
        for (int i=0;i<strs.length;i++) {
            workinghours[i] = Integer.parseInt(strs[i]);
        }

        int res = maxWorkinghourGap(workinghours);
        System.out.println(String.valueOf(res));

    }
}
