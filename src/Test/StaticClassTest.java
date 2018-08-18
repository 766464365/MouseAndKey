/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *___________________________by xuwei
 */

package Test;

public class StaticClassTest {
    public StaticClassTest(){
        System.out.println("父类构造方法");
    }
    static {
        System.out.println("父类静态方法");
    }

    public static void main(String[] args){
        children children=new children();

    }

}
