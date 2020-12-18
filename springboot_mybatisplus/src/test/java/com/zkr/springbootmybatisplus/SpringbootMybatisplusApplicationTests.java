package com.zkr.springbootmybatisplus;

import com.zkr.springbootmybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootMybatisplusApplicationTests {

	@Autowired
	UserMapper userMapper;


	@Test
	void contextLoads() {
		userMapper.selectList(null).forEach(user -> {
			System.out.println(user);
		});


	}

}
