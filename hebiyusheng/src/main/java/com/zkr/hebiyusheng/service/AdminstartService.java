package com.zkr.hebiyusheng.service;

import com.zkr.hebiyusheng.entity.Adminstart;

import java.util.List;

/**
 * @author LG
 * @date 2020/12/31 - 18:00
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
public interface AdminstartService {
    /**
     * 根据用户名查询用户信息进行登录
     * @param adminstart
     * @return
     */
    public List<Adminstart> loginUser(Adminstart adminstart);
}
