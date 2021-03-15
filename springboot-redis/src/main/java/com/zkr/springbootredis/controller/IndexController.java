package com.zkr.springbootredis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LiuGang
 * @date 2021/2/20 - 14:31
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class IndexController {

    /**
     * 首頁顯示控制器
     * @return
     */
    @GetMapping({"/","/index"})
    public String toindex(){
        return "index";
    }

}
