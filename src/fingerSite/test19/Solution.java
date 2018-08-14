/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package fingerSite.test19;

import java.util.ArrayList;

//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
// 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j]);
                if (j==matrix[i].length-1){
                    for(int k=i+1;k<)
                }
            }
        }
    }

    public static void main(String[] args){

    }
}
