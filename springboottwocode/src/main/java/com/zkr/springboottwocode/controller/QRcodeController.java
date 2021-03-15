package com.zkr.springboottwocode.controller;

import com.zkr.springboottwocode.util.ZxingUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.Random;

/**
 * @author LiuGang
 * @date 2021/1/7 - 14:56
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class QRcodeController {
    //这里说明一点，想要验证放入session中或者redies中，验证让过即可。
    // 和验证码的实现原理是一样，是不过换了一种验证方式。
    // 验证码字符集
    private static final char[] CHARS = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
            'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    // 字符数量
    private static final int SIZE = 6;

    @RequestMapping("/createQRcode")
    public void createQRcode(HttpServletResponse response) {
        StringBuffer sb = new StringBuffer();
        // 5.画随机字符
        Random ran = new Random();
        for (int i = 0; i < SIZE; i++) {
            // 取随机字符索引
            int n = ran.nextInt(CHARS.length);
            sb.append(CHARS[n]);
        }
        String contents = sb.toString();
        int width = 500; int height = 500; int margin = 2;

        try {
            BufferedImage QRcode = ZxingUtils.createQRImage(contents, width, height, margin);
            String logoPath = "D:\\IntelliJIDEA\\IdeaProject\\datascourcespring\\springboottwocode\\src\\main\\resources\\static\\img\\logo.png";
            int logoSize = 4;
            BufferedImage qRImageWithLogo = ZxingUtils.addQRImagelogo(QRcode, width, height, logoPath, logoSize);

            // 写入返回
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(qRImageWithLogo, "jpg", baos);

            byte[] QRJPG = baos.toByteArray();
            response.setHeader("Cache-Control", "no-store");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/jpeg");

            ServletOutputStream os = response.getOutputStream();
            os.write(QRJPG); // 自此完成一套，图片读入，写入流，转为字节数组，写入输出流
            os.flush();
            os.close();
            baos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
