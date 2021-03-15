package com.zkr.springbootswagger;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class SpringbootSwaggerApplicationTests {


    @Test
    public void TrA(){
        System.out.println("方法A");
        new SpringbootSwaggerApplicationTests().TrB();
    }


    @Transactional(propagation = Propagation.REQUIRED,readOnly = true)
    public void TrB(){
        System.out.println("方法B");
    }


}
