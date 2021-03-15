package com.zkr.excprodatacomment.controller;
import com.zkr.excprodatacomment.entity.CommentEntity;
import com.zkr.excprodatacomment.entity.ExcelPOJO;
import com.zkr.excprodatacomment.entity.TableNameORCloumn;
import com.zkr.excprodatacomment.service.CommentEntityService;
import com.zkr.excprodatacomment.util.CommentEntitySumExcelPojoCloum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

/**
 * @author LiuGang
 * @date 2021/3/2 - 18:04
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Controller
public class ExcelController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private final static String FILEURL  = "D:\\opt\\duibi.xlsx";

    @Autowired
    private CommentEntityService commentEntityService;

    /**
     * 数据结构修改页面
     * @return
     */
    @GetMapping("/excelpoi")
    public String excelindex(){
        logger.info("数据读取界都控制器....");
        return "excelpoi";
    }

    @PostMapping("/excelUpdateTableAdminCloumn")
    public String excelUpdateTableCloumnzhushi(TableNameORCloumn tableNameORCloumn){
        if (tableNameORCloumn==null){return "error";}
        //数据：获取的表字段结构（来源数据库）
        logger.info("获取数据库中字段原始数据结构......");
        List<CommentEntity> listcomment = commentEntityService.listcomment(tableNameORCloumn.getTableName());
        logger.info("excel数据字段字段等信息读取中.....");
        //数据：获取表字段结构注释（来源excel表格）
        List<ExcelPOJO> pojoList = CommentEntitySumExcelPojoCloum.getExcelpojoListMessage(FILEURL,tableNameORCloumn.getEndNumber(),ExcelPOJO.class);
        logger.info("原始数据+excel数据获取结束、开始数据整合.....");
        //整合
        List<CommentEntity> commentEntities = CommentEntitySumExcelPojoCloum.cloumnsToExcelPojoCloumns(listcomment, pojoList);
        logger.info("整合后的数据"+commentEntities.size());
        commentEntities.forEach(i-> System.out.println(i.toString()));
        logger.info("※※※数据遍历结束....");
        for (CommentEntity commentEntity : commentEntities) {
            try {
                logger.info("线程开启........");
                //进行线程保护（数据量较大的时候建议开启）
                Thread.sleep(2000);
                logger.info("线程等待........");
                commentEntityService.setColumnCommentMessage(commentEntity,tableNameORCloumn.getTableName());
                logger.info("线程唤醒........");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        logger.info("线程结束........");
        logger.info("开始数据共享中.......");
        return "redirect:/getcommentBiao/"+tableNameORCloumn.getTableName();
    }




}
