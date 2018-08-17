package dataStructor.sort;

import java.util.Arrays;

public class OrderTest {
    public static void main(String[] args){
        int[] testArray=new int[]{43,33,222,123};
//        int[] newArray= Sort.popSort(testArray);
//        for(int i=0;i<newArray.length;i++){
//            System.out.println(newArray[i]+"");
//        }
//        Arrays.sort(testArray);
//        for(int i=0;i<testArray.length;i++){
//            System.out.println(testArray[i]+"");
//        }
        MergeSort.sort(testArray);
        for(int i=0;i<testArray.length;i++){
            System.out.println(testArray[i]+"");
        }
    }
}
