package com.zkr.springboottwodata;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zkr.springboottwodata.mapper")
@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class SpringbootMybatisplusTwodataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisplusTwodataApplication.class, args);
	}

}
