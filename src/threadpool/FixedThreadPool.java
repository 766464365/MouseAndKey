/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//含有一定数量的公厕以供人们使用，无论人们在不在，公厕数量都不变，在用完一个之后，下一个线程才会使用
public class FixedThreadPool {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newFixedThreadPool(6);
        for(int i=0;i<50;i++){
            Runnable syncRunnable=new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            };
            executorService.execute(syncRunnable);
        }
    }
}
