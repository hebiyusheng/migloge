package com.zkr.excprodatacomment.controller;

import com.zkr.excprodatacomment.entity.Blongtext;
import com.zkr.excprodatacomment.entity.CommentEntity;
import com.zkr.excprodatacomment.service.CommentEntityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    /**
     * 此方法留着 用处数据字段导入
     * @param tablesName
     * @param model
     * @param session
     * @return
     */
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

    /**
     * 数据库字段详细信息走这个方法（更加详细）
     * @param tablesName
     * @param model
     * @return
     */
    @GetMapping("/getblongtextall/{tablesName}")
    public String getblongtextall(@PathVariable("tablesName") String tablesName, Model model,HttpSession session){
        logger.info("开始查询数据库操作....");
        List<Blongtext> getblogtext = commentEntityService.blongtextall(tablesName);
        logger.info("开始数据共享缓存中....");
        model.addAttribute("blongtext",getblogtext);
        return "blongtextlist";
    }


    /**
     *
     * @param tablesName
     * @param model
     * @return
     */
    @RequestMapping("/queryAllLongtext")
    public String blongtextList(String tablesName, Model model){
        List<Blongtext> getblogtext = commentEntityService.getblogtext();
        model.addAttribute("getblogtext",getblogtext);
        return "blongtext";
    }


    @RequestMapping(value = "/toUpdateColumpage")
    public String toupdateClomupage(){
        System.out.println("请求加载字段信息");
        return "updatecolum";
    }



    @Transactional
    @ResponseBody
    @RequestMapping(value = "/updateCloumnmess",method = RequestMethod.POST)
    public String updateCloumnMesg(Blongtext blongtext){
        boolean flag = true;
        if (blongtext!=null){
            try {
                commentEntityService.updateCloumnMessage(blongtext);
            }catch (Exception e){
                flag = false;
                e.printStackTrace();
            }
        }
        System.out.println(blongtext);
        if (flag){
            return "success";
        }else {
            return "error";
        }
    }





}
