package com.zkr.hebiyusheng.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zkr.hebiyusheng.entity.Adminstart;
import com.zkr.hebiyusheng.mapper.AdminstartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author LG
 * @date 2020/12/30 - 19:46
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Controller
public class AdminstartController {

    @Autowired
    private AdminstartMapper adminstartMapper;


    @ResponseBody
    @GetMapping("/list")
    public String adminstartList(){
        Adminstart adminstart = new Adminstart();
        adminstart.setUsername("admin").setPassword("123");
        QueryWrapper<Adminstart> queryWrapper = new QueryWrapper<>();
        queryWrapper.setEntity(adminstart);
        List<Adminstart> adminstarts = adminstartMapper.selectList(queryWrapper);
        adminstarts.forEach(i-> System.out.println(i));
        return "已成功查询";
    }

}
