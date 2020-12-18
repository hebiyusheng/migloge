package com.zkr.springbootmybatisplus.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author LG
 * @date 2020/12/18 - 18:12
 * @Motto "人生能有几回搏！！！Good Luck Me"
 * mybatisplus分页插件
 */
@Configuration
public class Myconfig {

    /**
     * 分页插件
     * @return 分页插件的实例
     */
    @Bean
    public PaginationInnerInterceptor paginationInterceptor() {
        return new PaginationInnerInterceptor();
    }

}
