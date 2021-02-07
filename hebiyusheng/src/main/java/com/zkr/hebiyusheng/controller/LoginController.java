package com.zkr.hebiyusheng.controller;

import com.zkr.hebiyusheng.entity.Adminstart;
import com.zkr.hebiyusheng.service.AdminstartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LG
 * @date 2020/12/31 - 15:34
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Controller
public class LoginController {

    @Autowired
    AdminstartService adminstartService;

    @GetMapping(value = {"/","","login"})
    public String loginPage(){
        return "login";
    }

    @ResponseBody
    @PostMapping("/logintoIndex")
    public Map<String,Object> loginForIndex(Adminstart adminstart, HttpSession session){
        List<Adminstart> loginUser = adminstartService.loginUser(adminstart);
        System.out.println("查询到的数据："+loginUser);
        Map<String, Object> map = new HashMap<>();
        if (loginUser.size()==0){
            map.put("result","error");
            map.put("msg","ERROR");
            map.put("code","登录失败，请重新登录");
            return map;
        }
        session.setAttribute("user",loginUser);
        map.put("result","success");
        map.put("msg","OK");
        map.put("code","登录失败，请重新登录");
        return map;
    }
}
