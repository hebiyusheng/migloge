package com.zkr.excprodatacomment.controller;

import com.zkr.excprodatacomment.entity.search.SearchCloumnsMeaasge;
import com.zkr.excprodatacomment.entity.search.SearchPageValue;
import com.zkr.excprodatacomment.service.SearchCloumnsMeaasgeService;
import com.zkr.excprodatacomment.util.SerachCloumnDisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author LiuGang
 * @date 2021/3/4 - 17:18
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class SearchCloumnMeaasgeData {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SearchCloumnsMeaasgeService searchCloumnsMeaasgeService;

    @GetMapping("/searchCloumnMessage")
    public String toSearchPage(HttpSession session){
        boolean flage = true;
        logger.info("到达全文检索特殊字符页面....");
        logger.info("开始查询匹配信息返回...");
        //查询结果
        List<SearchCloumnsMeaasge> cloumnsMeaasges = searchCloumnsMeaasgeService.listSerchCloumn();
        //处理后的结果
        List<SearchCloumnsMeaasge> removeDuplicateOrder = SerachCloumnDisUtil.removeDuplicateOrder(cloumnsMeaasges);
        logger.info("需要修改的总记录数："+removeDuplicateOrder.size());
        session.setAttribute("removeDuplicateOrder",removeDuplicateOrder);
        return "searchCloumn";
    }

    @ResponseBody
    @PostMapping("/thsearchcloumnCome")
    public String thSearchCloumnCome(SearchPageValue searchPageValue,HttpSession session){
        boolean flage = true;
        if (searchPageValue==null){return "error";}
        //表和对应的表名
        List<SearchCloumnsMeaasge> removeDuplicateOrder = (List<SearchCloumnsMeaasge>) session.getAttribute("removeDuplicateOrder");
        try {
            logger.info("线程开启.......");
            for (SearchCloumnsMeaasge cloumnsMeaasge : removeDuplicateOrder) {
                logger.info("线程休眠.......");
                Thread.sleep(3000);
                logger.info("线程唤醒开始执行.......");
                searchCloumnsMeaasgeService.updateSearchCloumnteshu(searchPageValue,cloumnsMeaasge);
                logger.info("当前线程结束开启下次线程.......");
            }
            logger.info("线程结束.......");
        } catch (Exception e) {
            flage = false;
            e.printStackTrace();
        }
        if (flage){
            return "success";
        }else {
            return "error";
        }
    }


}
