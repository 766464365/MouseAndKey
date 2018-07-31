package callBack;

public class utilClass {
    public int num;

    public void utilClass(int a){
        this.num=a;
    }
    public void setdata(int a){
        num=a;
    }

    public void test(myCallBack myCallBack){
        myCallBack.getCallBackSucceed(num);
    }




    public interface myCallBack {
        public void getCallBackSucceed(int msg);
    }
}
