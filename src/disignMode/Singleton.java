/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package disignMode;

public class Singleton {
    private volatile Singleton singletonInstance;
    private Singleton(){

    }

    public Singleton getSingletonInstance() {
        if(singletonInstance==null){
            synchronized (Singleton.class){
                if (singletonInstance==null){
                    singletonInstance=new Singleton();
                }
            }
        }
        return singletonInstance;
    }
}
