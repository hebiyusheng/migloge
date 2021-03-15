package com.zkr.excprodatacomment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@MapperScan("com.zkr.excprodatacomment.mapper")
@SpringBootApplication
public class ExcproDataCommentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExcproDataCommentApplication.class, args);
    }

}
