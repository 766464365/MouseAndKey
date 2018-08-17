/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package Test;

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * The type Input control.
 */
//常见的oj输入格式取值问题
public class InputControl {
    /**
     * Read int.
     * <p>
     * 读入整数
     * input
     * 12
     */
    public static void readInt(){
        //使用Buffered更快
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
//        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(sc.nextInt());
        }
    }

    /**
     * Read string.
     * 读取字符串
     * input：
     * dadwadwad
     * output：
     * dadwadwad
     */
    public static void readString(){
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
//        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
    }

    /**
     * Read line string.
     * 读取多行数据  第一行代表一组数据的个数
     * input
     * 2
     * dadasd sadas
     * 4
     * dsa
     * dsad
     * sad
     * asd
     *
     */
    public static void readLineString(){
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
//        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println(sc.next());
            }
        }
    }


    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[] args){
//        Scanner sc=new Scanner(new BufferedInputStream(System.in));
//        while(sc.hasNext()){
//            int h=sc.nextInt();
//            for(int i=0;i<h;i++){
//                System.out.println(sc.nextLine());
//            }
//        }
//        readString();
        readLineString();
    }
}
