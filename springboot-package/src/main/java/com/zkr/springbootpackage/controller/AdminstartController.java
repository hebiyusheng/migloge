package com.zkr.springbootpackage.controller;

import com.zkr.springbootpackage.entity.Adminstart;
import com.zkr.springbootpackage.mapper.AdminstartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/2/3 - 15:07
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class AdminstartController {

    @Autowired
    private AdminstartMapper adminstartMapper;

    @GetMapping({"/","/index","/home"})
    public String index(Model model){
        List<Adminstart> adminstarts = adminstartMapper.selectList(null);
        adminstarts.forEach(i-> System.out.println(i));
        model.addAttribute("user",adminstarts);
        return "index";
    }

}
