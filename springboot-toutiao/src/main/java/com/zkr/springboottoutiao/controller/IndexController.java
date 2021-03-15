package com.zkr.springboottoutiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LiuGang
 * @date 2021/2/11 - 0:37
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class IndexController {

    /**
     * 爬虫热搜页面的控制页面首页展示
     */
    @GetMapping({"/","/index"})
    public String toIndex(){
        return "index";
    }

}
