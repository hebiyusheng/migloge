package com.zkr.excprodatacomment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author LiuGang
 * @date 2021/2/26 - 15:51
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class IndexController {

    @GetMapping({"/","index"})
    public String index(){
        return "index";
    }

}
