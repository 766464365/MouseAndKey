package input;

import java.util.ArrayList;
import java.util.List;

public class String2KeyCode {


    public static List<Integer> getKeyCode(String str) {
        char ss[] = str.toCharArray();//利用toCharArray方法转换
        List<Integer> keyCode = new ArrayList<Integer>();
        //字符串转字符数组
        for (int i = 0; i < ss.length; i++) {
//            System.out.println(ss[i]);
            keyCode.add((int) ss[i]);
        }
        //最后返回keyCode数组
        return  keyCode;
    }


    public static void main(String[] args) {
        List<Integer> aa=getKeyCode("www.baidu.com");
        for(int a=0;a<aa.size();a++){
            System.out.println(String.valueOf(aa.get(a)));
        }
    }
}
