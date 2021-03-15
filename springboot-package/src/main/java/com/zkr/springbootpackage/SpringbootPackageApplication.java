package com.zkr.springbootpackage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.zkr.springbootpackage.mapper")
public class SpringbootPackageApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPackageApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //指向Application启动类
        return builder.sources(SpringbootPackageApplication.class);
    }
}
