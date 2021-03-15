package com.zkr.springbootemail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author LiuGang
 * @date 2021/1/6 - 14:55
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@RestController
public class EmailController {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String username;

    @GetMapping("/send")
    public String send(){
        //建立邮箱消息
        SimpleMailMessage message = new SimpleMailMessage();
        //发送者
        message.setFrom(username);
        //接收者
        message.setTo("95354416@qq.com");
        //发送标题
        message.setSubject("测试");
        //发送内容
        Random random = new Random(10);
        message.setText("测试数据验证码："+random);
        javaMailSender.send(message);
        return "1";
    }

}
