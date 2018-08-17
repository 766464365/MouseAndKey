/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
//设置了核心线程数的延时任务  下面是延迟5秒之后执行
public class ScheduledThreadPool {
    public static void main(String[] args){
        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(5);
        for(int i=0;i<20;i++){
            Runnable syncRunnable=new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            };
            executorService.scheduleAtFixedRate(syncRunnable,5000,3000, TimeUnit.MILLISECONDS);
        }
    }
}
