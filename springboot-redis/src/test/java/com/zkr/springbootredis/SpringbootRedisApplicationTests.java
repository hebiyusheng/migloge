package com.zkr.springbootredis;

import cn.hutool.core.io.file.FileReader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Test
	void contextLoads() {
		redisTemplate.opsForValue().set("name","李四");
		redisTemplate.opsForValue().set("xinming","admin");
	}

	@Test
	void convater(){
		FileReader fileReader = new FileReader("C:\\Users\\hebiy\\Desktop\\admin.txt");
		String result = fileReader.readString();
		System.out.println(result);
	}


}
