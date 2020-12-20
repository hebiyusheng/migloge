package com.zkr.springbootmybatisplus.controller;

import com.zkr.springbootmybatisplus.entity.User;
import com.zkr.springbootmybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author LG
 * @date 2020/12/18 - 14:49
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public List<User> SelectListUser() {
        return userService.SelectUserlist();
    }


    @PostMapping("/save")
    public Boolean saveUser() {
        User user = new User(null, "gqk", 22, "admin@163.com");
        return userService.saveUser(user);
    }


}
