package com.zkr.springboottwodata;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class SpringbootMybatisplusTwodataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisplusTwodataApplication.class, args);
	}

}
