package com.zkr.springbootmybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zkr.springbootmybatisplus.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author LG
 * @date 2020/12/18 - 14:36
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Repository("userMapper")
public interface UserMapper extends BaseMapper<User> {

}
