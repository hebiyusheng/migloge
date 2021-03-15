package com.zkr.len01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LiuGang
 * @date 2021/2/1 - 14:14
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class IndexController {

    @GetMapping({"/","/index","home"})
    public String index(){
        return "index";
    }

}
