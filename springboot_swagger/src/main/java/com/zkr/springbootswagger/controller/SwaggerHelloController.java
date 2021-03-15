package com.zkr.springbootswagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LG
 * @date 2020/12/21 - 18:28
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@RestController("/swager")
public class SwaggerHelloController {

    @RequestMapping("/shelo")
    public String swagerHello(){
        return "SpringBoot-Swagger-API";
    }

}
