import input.String2KeyCode;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

public class Main {
    static Robot robot;
    public static void main(String[] args) {
        try {
            robot = new Robot();//创建Robot对象
            callApplication("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
//            robot.delay(5000);
//            robot.mouseMove(100,200);

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("程序结束");

    }
    //调用程序
    public static void callApplication(String appStr){
        Runtime rt = Runtime.getRuntime();
        Process p = null;
        System.out.println(appStr);
        String fileLac = "";
        try {
            fileLac = appStr;// 要调用的程序路径
            p = rt.exec(fileLac);
            robot.delay(2000);
            overSizeApp();      //在这里进行最大化处理
            robot.delay(1000);

        } catch (Exception e) {
            System.out.println("open failure");
        }
//        inputUrl("WWW.BAIDU.COM");
        input("https://jwc.scnu.edu.cn/");
    }

    //最大化程序
    public static void overSizeApp(){
        robot.keyPress(18);     //alt
        robot.keyPress(32);     //空格
        robot.keyPress(88);     //N
        robot.keyRelease(18);
        robot.keyRelease(32);
        robot.keyRelease(88);
    }

    //输入指定文字  通过剪贴板粘贴
    public static void input(String inputUri){
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new StringSelection(inputUri), null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.delay(500);
        robot.keyPress(10);
        robot.keyRelease(10);
    }
}
