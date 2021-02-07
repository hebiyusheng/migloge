package com.zkr.hebiyusheng.service.serviceImpl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zkr.hebiyusheng.entity.Adminstart;
import com.zkr.hebiyusheng.mapper.AdminstartMapper;
import com.zkr.hebiyusheng.service.AdminstartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LG
 * @date 2020/12/31 - 17:59
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Service
public class AdminstartServiceImpl implements AdminstartService {

    @Autowired
    AdminstartMapper adminstartMapper;

    @Override
    public List<Adminstart> loginUser(Adminstart adminstart) {
        if (adminstart == null){
            return null;
        }
        QueryWrapper<Adminstart> queryWrapper = new QueryWrapper<>();
        queryWrapper.setEntity(adminstart);
        List<Adminstart> adminstarts = adminstartMapper.selectList(queryWrapper);
        return adminstarts;
    }
}
