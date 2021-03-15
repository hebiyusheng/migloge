package com.zkr.springbootfileupload.controller;

import com.zkr.springbootfileupload.entity.Adminstart;
import com.zkr.springbootfileupload.service.AdminstartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author LG
 * @date 2020/12/29 - 20:24
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Controller
public class AdminstartController {
    @Autowired
    AdminstartService adminstartService;

    @GetMapping("/index")
    public String index(){
        return "fileload";
    }




    @ResponseBody
    @GetMapping("/user")
    public List<Adminstart> getadminstartList(Adminstart adminstart){
        return adminstartService.getAdminstart(adminstart);
    }


}
