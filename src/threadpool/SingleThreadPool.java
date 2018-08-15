/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//单线程的线程池   类似于队列FIFO的执行。
public class SingleThreadPool {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        for(int i=0;i<10;i++){
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
