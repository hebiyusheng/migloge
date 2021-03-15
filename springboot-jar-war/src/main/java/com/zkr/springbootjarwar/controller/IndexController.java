package com.zkr.springbootjarwar.controller;

import com.zkr.springbootjarwar.enrity.Mesages;
import com.zkr.springbootjarwar.mapper.MesagesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/2/23 - 16:03
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@RestController
@RequestMapping("/list")
public class IndexController {

    @Autowired
    private MesagesMapper mesagesMapper;

    @GetMapping("/all")
    public List<Mesages> index(){
        return mesagesMapper.selectList(null);
    }


}
