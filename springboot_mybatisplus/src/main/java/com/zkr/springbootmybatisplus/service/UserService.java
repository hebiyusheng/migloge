package com.zkr.springbootmybatisplus.service;

import com.zkr.springbootmybatisplus.entity.User;
import com.zkr.springbootmybatisplus.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LG
 * @date 2020/12/18 - 14:59
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Service(value = "userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询集合
     *
     * @return
     */
    public List<User> SelectUserlist() {
        return userMapper.selectList(null);
    }

    /**
     * 保存或者根据主键修改对象
     *
     * @param user
     * @return
     */
    public Boolean saveUser(User user) {
        boolean flge = true;
        try {
            userMapper.insert(user);
        } catch (Exception e) {
            flge = false;
            e.printStackTrace();
        }
        return flge;
    }


}
