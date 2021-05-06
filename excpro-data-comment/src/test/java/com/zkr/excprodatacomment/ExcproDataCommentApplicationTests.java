package com.zkr.excprodatacomment;

import com.zkr.excprodatacomment.entity.ExcelPOJO;
import com.zkr.excprodatacomment.util.ExcelRead;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

@SpringBootTest
class ExcproDataCommentApplicationTests {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @Test
    void contextLoads() throws Exception  {
        /** 方法一
         * fileName:Excel文件路径
         * StatrRow：读取的开始行数（默认填0）
         * EndRow：读取的结束行数（填-1为全部）
         * ExistTop:是否存在头部（如存在则读取数据时会把头部拼接到对应数据作为KEY，若无则KEY为当前列数）
         */
        /*List<Map<String,Object>> result = excelRead.ReadExcelByRC("D:.xls",2,10,false);
        System.out.println(result.size());
        System.out.println(result);*/

        /**
         * 方法二
         * ReadExcelByPOJO(String fileName, int StatrRow, int EndRow, Class t)
         * fileName:Excel文件路径
         * StatrRow：读取的开始行数（默认填0）
         * EndRow：读取的结束行数（填-1为全部）
         * Class<T>：传过来的实体类类型
         */
        List<Object> result2 = ExcelRead.ReadExcelByPOJO("D:\\opt\\duibi.xlsx",2,13, ExcelPOJO.class);
        System.out.println(result2.size());
        for(Object object:result2){
            ExcelPOJO excelPOJO = new ExcelPOJO();
            excelPOJO = (ExcelPOJO) object;
            System.out.println(excelPOJO.getZhushi());
        }

    }

    public void test11(){
    }



}
