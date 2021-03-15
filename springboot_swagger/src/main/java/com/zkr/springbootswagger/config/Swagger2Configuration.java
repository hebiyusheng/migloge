package com.zkr.springbootswagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author LG
 * @date 2020/12/21 - 18:29
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    /**
     * Swagger配置类
     */
    private String SWAGGER_SCAN_BASE_PACKAGE = "com.zkr.springbootswagger.controller";
    public static final String VERSION = "V1.0";

    @Bean
    public Docket ceateRestSwaggerApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("hebiyusheng")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }



    @Bean
    public Docket ceateRestSwaggerApis(){
        return new Docket(DocumentationType.SWAGGER_2)
                //用来创建分组模块
                .groupName("nishuone")
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }


    /**
     * Api文档的基本信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("非车理赔管理系统")
                .version("1.0")
                .description("API接口操作文档")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact(new Contact("微信公众号：IT特靠谱", "https://blog.csdn.net/IT_Most", "123456@qq.com"))
                .build();
    }



}
