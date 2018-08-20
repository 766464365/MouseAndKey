/*
 *While writing this code, only God and I know what it is.
 *And now only God knows it
 *____________________________________by xuwei
 */
package disignMode;

public class BuilderMode {
    //必须参数
    private int user;
    private int password;
    //可选参数
    private int age;
    public BuilderMode(Builder builder){
        this.user=builder.user;
        this.password=builder.password;
        this.age=builder.age;
    }

    public static class Builder {
        //必须参数
        private final int user;
        private final int password;
        //可选参数
        private int age;
        public Builder (int user,int password){
            this.user=user;
            this.password=password;
        }
        public Builder setAge(int age){
            this.age=age;
            return this;
        }

        public BuilderMode build(){
            return new BuilderMode(this);
        }
    }
    public static void main(String[] atgs){
        BuilderMode builderMode=new BuilderMode.Builder(1,2).setAge(2).build();
        System.out.println(builderMode.age);
    }
}