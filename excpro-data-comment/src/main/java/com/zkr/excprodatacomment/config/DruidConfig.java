package com.zkr.excprodatacomment.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;

/**
 * @author LiuGang
 * @date 2021/3/2 - 10:56
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Configuration
public class DruidConfig {
    //将我们自己编写的数据源信息进行映射、找到并修改掉springboot默认的spring.datasource
    //自己创建druid数据源信息
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }
    /**
     *   配置Druid的监控
     * 1、配置一个管理厚爱的servlet
     * 2、配置一个web监控管理
     */
    //后台监控
    @Bean
    public ServletRegistrationBean statViewServlet() {
        //注册 ServletBean
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");
        //设置后台登录的账号密码
        HashMap<String, String> initParameters = new HashMap<>();
        initParameters.put("loginUsername", "admin");
        initParameters.put("loginPassword", "123456");
        //允許谁能访问  initParameters.put("username","password");
        bean.setInitParameters(initParameters);//初始化参数
        return bean;
    }
    //过滤资源
    @Bean
    public FilterRegistrationBean webStatFilter() {
        //注册 FilterBean
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        //可以过滤那些请求?
        HashMap<String, String> initParameters = new HashMap<>();
        //这些东西不进行统计
        initParameters.put("exclusions", "*.js,*.css,/druid/*");
        bean.setInitParameters(initParameters);//初始化参数
        return bean;
    }

}
