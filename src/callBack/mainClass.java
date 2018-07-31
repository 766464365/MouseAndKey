package callBack;

public class mainClass {
    public static void main(String[] args){
        int a=1;
       utilClass mutilClass=new utilClass();
       mutilClass.setdata(1);
        mutilClass.test(new utilClass.myCallBack() {
            @Override
            public void getCallBackSucceed(int msg) {
                System.out.println(msg+"");
            }
        });
    }

}
