package com.zkr.hebiyusheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zkr.hebiyusheng.mapper")
public class HebiyushengApplication {

    public static void main(String[] args) {
        SpringApplication.run(HebiyushengApplication.class, args);
    }

}
