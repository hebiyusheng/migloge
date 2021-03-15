package com.zkr.springbootfileupload;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zkr.springbootfileupload.mapper")
public class SpringbootFileuploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFileuploadApplication.class, args);
    }

}
