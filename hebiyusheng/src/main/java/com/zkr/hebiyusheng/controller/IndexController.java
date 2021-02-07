package com.zkr.hebiyusheng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LG
 * @date 2020/12/30 - 19:44
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Controller
public class IndexController {

    @GetMapping("/indexpage")
    public String indexPage(){
        return "index";
    }

}
