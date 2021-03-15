package com.zkr.springbootjarwar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.zkr.springbootjarwar.mapper")
public class SpringbootJarWarApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJarWarApplication.class, args);
    }

    /**
     * 继承SpringbootJarWarApplication 重写 configure
     * 实现war外部程序主入口的指定
     * @param builder
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootJarWarApplication.class);
    }
}
