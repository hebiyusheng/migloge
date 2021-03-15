package xinte;

import cn.hutool.crypto.SecureUtil;

/**
 * @author LiuGang
 * @date 2021/2/25 - 19:24
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public class Test {

    public static void main(String[] args) {
        double a = 67556.32;

        System.out.println(SecureUtil.md5("hello"));
    }
    /**
     * 加密解密工具:
     * 对称加密（symmetric），例如：AES、DES等
     * 非对称加密（asymmetric），例如：RSA、DSA等
     * 摘要加密（digest），例如：MD5、SHA-1、SHA-256、HMAC等
     * 5d41402abc4b2a76b9719d911017c592
     */

    public void testSecureUtil(){
        System.out.println("MD5:"+ SecureUtil.md5("hzkj"));
        System.out.println("SHA256:"+SecureUtil.sha256("hzkj"));
    }


}
