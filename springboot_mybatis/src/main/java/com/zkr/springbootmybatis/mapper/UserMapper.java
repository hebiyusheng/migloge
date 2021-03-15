package com.zkr.springbootmybatis.mapper;

import com.zkr.springbootmybatis.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LG
 * @date 2020/12/20 - 21:42
 * @Motto "人生能有几回搏！！！Good Luck Me"
 * User jiekou
 */
@Repository("userMapper")
public interface UserMapper {
    /**
     * 保存一个User对象
     * @param user
     */
    void saveUser(User user);

    /**
     * 修改一个User对象
     * @param user
     */
    void UpdateUser(User user);

    /**
     * 查询全队User对象
     * @return
     */
    List<User> listUser();

    /**
     * 根据Id进行删除一个User对象
     * @param id
     */
    void deleteUser(Long id);

    /**
     * 根据Id进行检索一个User对象
     * @param id
     * @return
     */
    User findById(Long id);


    Integer insertuserTo(User user);

}
