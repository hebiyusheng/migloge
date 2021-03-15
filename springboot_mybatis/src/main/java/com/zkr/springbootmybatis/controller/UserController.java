package com.zkr.springbootmybatis.controller;

import com.zkr.springbootmybatis.entity.User;
import com.zkr.springbootmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LG
 * @date 2020/12/20 - 21:55
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    /**
     * 查询ListUser
     * @return
     */
    @GetMapping("/listuser")
    public List<User> listUser(){
        return userMapper.listUser();
    }

    /**
     * 根据Id检索User对象
     * @param id
     * @return
     */
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Long id){
        return userMapper.findById(id);
    }

    /**
     * 根据ID删除一个User对象后查询全部User对象
     * @param id
     * @return
     */
    @RequestMapping("/deleteById/{id}")
    public List<User>  deleteById(@PathVariable(value = "id") Long id){
        userMapper.deleteUser(id);
        return userMapper.listUser();
    }

    /**
     * 保存User对象后查询全部User对象
     * @return
     */
    @RequestMapping("/saveUser")
    public List<User> insertUser(){
        User user = new User(27L,"张三",22,"amdinop@142.com");
        userMapper.saveUser(user);
        return  userMapper.listUser();
    }

    /**
     * 保存用户信息并且返回最大值
     */
    @RequestMapping("/insertUserTo")
    public void insertUsrto(){
        User user = new User();
        user.setId(24L);
        user.setAge(24);
        user.setEmail("123123");
        user.setName("新滩");
        Integer integer = userMapper.insertuserTo(user);
        System.out.println("影响操作行数"+integer);
    }







}
