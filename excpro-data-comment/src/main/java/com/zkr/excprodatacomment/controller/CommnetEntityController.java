package com.zkr.excprodatacomment.controller;

import com.zkr.excprodatacomment.entity.CommentEntity;
import com.zkr.excprodatacomment.service.CommentEntityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author LiuGang
 * @date 2021/2/26 - 16:07
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class CommnetEntityController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private final static String FILEURL  = "D:\\opt\\duibi.xlsx";

    @Autowired
    private CommentEntityService commentEntityService;



    @GetMapping("/getcommentBiao/{tablesName}")
    public String getcommentMessageBiao(@PathVariable("tablesName") String tablesName, Model model, HttpSession session){
        logger.info("开始查询数据库操作....");
        //数据：获取的表字段结构（来源数据库）
        List<CommentEntity> listcomment = commentEntityService.listcomment(tablesName);
        logger.info("开始数据共享缓存中....");
        session.setAttribute("tablename",tablesName);
        model.addAttribute("tablemessage",listcomment);
        return "commentlist";
    }
}
