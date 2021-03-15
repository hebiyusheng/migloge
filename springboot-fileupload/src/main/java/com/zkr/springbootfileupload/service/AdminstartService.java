package com.zkr.springbootfileupload.service;

import com.zkr.springbootfileupload.entity.Adminstart;
import com.zkr.springbootfileupload.mapper.AdminstartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author LG
 * @date 2020/12/29 - 20:10
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Service
public class AdminstartService {
    @Autowired
    private AdminstartMapper adminstartMapper;

    /**
     * 根据用户名和密码进行查询
     * @param adminstart
     * @return
     */
    public List<Adminstart> getAdminstart(Adminstart adminstart){
        Map<String ,Object> adminstartMap = new HashMap();
        adminstartMap.put("admin",adminstart.getUsername());
        adminstartMap.put("admin",adminstart.getPassword());
        List<Adminstart> adminstartList = adminstartMapper.selectByMap(adminstartMap);
        return adminstartList;
    }

}
