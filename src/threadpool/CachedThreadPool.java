/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//缓存模式，就是一大群在一个很大的咖啡厅喝咖啡，特殊的是，客人喝完的咖啡会被保留一定时延，下一波客人来的客人可能就会喝上这些剩余的咖啡
public class CachedThreadPool {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(int i=0;i<1000;i++){
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
