package com.zkr.excprodatacomment.util;

import com.zkr.excprodatacomment.entity.CommentEntity;
import com.zkr.excprodatacomment.entity.ExcelPOJO;

import java.util.ArrayList;
import java.util.List;
/**
 * @author LiuGang
 * @date 2021/3/2 - 18:19
 * @Motto "何必余生、及时行乐、Good luck mi"
 * 进行数据转换合并
 */
public class CommentEntitySumExcelPojoCloum {
    /**
     * 进行数据整合操作
     * @param commentEntityList   前台获取的数据表返回该数据表的结构(存在多个)
     * @param excelPOJOList       excel程序读取的数据结构中包含注释和对应字段(存在多个)
     * 返回一个包含注释字段的CommentEntity对象即可
     */
    public static List<CommentEntity> cloumnsToExcelPojoCloumns(List<CommentEntity> commentEntityList, List<ExcelPOJO> excelPOJOList){
        List<CommentEntity> commentEntityListNew = new ArrayList<>();
        //非空判断实体对象 这里使用isEmpty进行判断是否存在元素
        if (!commentEntityList.isEmpty() && !excelPOJOList.isEmpty()){
            //获取所有字段均为大写的集合
            List<ExcelPOJO> pojos = cloumnToExcel(excelPOJOList);
            for (int i = 0; i < pojos.size() ; i++) {
                //处理掉注释字段前面的无用符号
                pojos.get(i).setZhushi(replcesStrteshuzifu(pojos.get(i).getZhushi()));
                for (int j = 0; j < commentEntityList.size();j++) {
                    if (pojos.get(i).getCloumns().equalsIgnoreCase(commentEntityList.get(j).getColumnName())){
                        commentEntityList.get(j).setColumnComment(pojos.get(i).getZhushi());
                        commentEntityListNew.add(commentEntityList.get(j));
                    }
                }
            }
        }
        List<CommentEntity> entityList = commentEntitiesSetListMessage(commentEntityList);
        return entityList;
    }

    /**
     * 分装读取excel数据进行返回
     * @param fileurl  文件路径
     * @param endnumber 操作的表名
     * @param t   封装的对应实体类
     * @return
     */
    public static List<ExcelPOJO> getExcelpojoListMessage(String fileurl,int endnumber,Class t){
        List<ExcelPOJO> pojoList = new ArrayList<>();
        try {
            List<Object> result2 = ExcelRead.ReadExcelByPOJO(fileurl,2,endnumber, t);
            System.out.println("共获取数据条数："+result2.size());
            for(Object object:result2){
                pojoList.add((ExcelPOJO) object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pojoList;
    }







    /**
     * 进行集合中的字段转为通用的大写
     * @param excelPOJOList
     * @return
     */
    public static List<ExcelPOJO> cloumnToExcel(List<ExcelPOJO> excelPOJOList){
        List<ExcelPOJO> excelPOJOListTo = new ArrayList<>();
        if (!excelPOJOList.isEmpty()){
            for (ExcelPOJO pojo : excelPOJOList) {
                pojo.setCloumns(pojo.getCloumns().toUpperCase());
                excelPOJOListTo.add(pojo);
            }
        }
        return excelPOJOListTo;
    }
    /**
     * 处理注释中的特殊字符
     * @param string
     * @return
     */
    public static String replcesStrteshuzifu(String string){
        if (string!=null){
            if (string.trim().contains("--") && string.trim().contains("**")){
                String replace1 = string.replace("--", "").replace("**", "");
                return replace1;
            }else if (string.trim().contains("--")){
                String replace2 = string.trim().replace("--", "");
                return replace2;
            }else if (string.trim().contains("**")){
                String replace3 = string.trim().replace("**", "");
                return replace3;
            }
        }
        return string;
    }

    /**
     * 处理结果集中出现null的对象排除在外
     * @param list
     * @return
     */
    public static List<CommentEntity> commentEntitiesSetListMessage(List<CommentEntity> list){
        List<CommentEntity> commentEntityList = new ArrayList<>();
        for (CommentEntity commentEntity : list) {
            if (commentEntity.getColumnComment()!=null){
                commentEntityList.add(commentEntity);
            }
        }
        return commentEntityList;
    }



}
