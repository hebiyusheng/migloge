package com.zkrj.len02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LiuGang
 * @date 2021/2/1 - 14:19
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class HomeController {

    @GetMapping({"/","/home","index"})
    public String home(){
        return "home";
    }


}
