package security.des;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.SecureRandom;

public class DesTest {

    /**
     * Main.
     *
     * 主函数
     * @param args the args
     */
    public static void main(String[] args){
        String content = "这是加密的内容";
        String password = "123456789";//不明白原文为啥说密码必须是8的位数。。。
        System.out.println("密　钥：" + password);
        System.out.println("加密前：" + content);
        byte[] result = encrypt(content, password);
        System.out.println("加密后：" + new String(result));
        String decryResult = decrypt(result, password);
        System.out.println("解密后：" + decryResult);
    }


    /**
     * 加密
     *
     * @param content
     *            待加密内容
     * @param key
     *            加密的密钥
     * @return
     */
    public static byte[] encrypt(String content, String key) {
        try {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(key.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("des");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance("des");
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            byte[] result = cipher.doFinal(content.getBytes());
            return result;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }
    /**
     * 解密
     *
     * @param content
     *            待解密内容
     * @param key
     *            解密的密钥
     * @return
     */
    public static String decrypt(byte[] content, String key) {
        try {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(key.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("des");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance("des");
            cipher.init(Cipher.DECRYPT_MODE, securekey, random);
            byte[] result = cipher.doFinal(content);
            return new String(result);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }
}
