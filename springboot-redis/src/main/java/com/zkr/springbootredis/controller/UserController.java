package com.zkr.springbootredis.controller;

import com.zkr.springbootredis.entity.User;
import com.zkr.springbootredis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/2/20 - 14:47
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserMapper userMapper;


    @GetMapping("/userlist")
    @ResponseBody
    @Cacheable("userlist")
    public List<User> userList(){
        List<User> userList = userMapper.selectList(null);
        return userList;
    }

}
