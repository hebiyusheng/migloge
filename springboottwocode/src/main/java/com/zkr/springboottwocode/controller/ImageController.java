package com.zkr.springboottwocode.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author LiuGang
 * @date 2021/1/7 - 20:18
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
@RequestMapping(value = "/image")
public class ImageController {

    @GetMapping("/")
    public String yus(){
        return "inmg";
    }



    @RequestMapping(value = "/get",produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] getImage(HttpSession session) throws IOException {
        File file = new File("C:\\Users\\hebiy\\Desktop\\cilogo.png");
        FileInputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        session.setAttribute("img",bytes);
        return bytes;
    }
}
