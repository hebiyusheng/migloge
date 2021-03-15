package com.zkr.excprodatacomment.controller;

import com.zkr.excprodatacomment.entity.TablesAllName;
import com.zkr.excprodatacomment.service.TablesAllNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/3/1 - 10:27
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class TablesAllNameController {

    @Autowired
    private TablesAllNameService tablesAllNameService;


    @GetMapping("/tableallName")
    public String tableallpage(Model model){
        List<TablesAllName> tablesAllNames = tablesAllNameService.getallTableName();
        model.addAttribute("tablesAll",tablesAllNames);
        return "tableall";
    }


}
