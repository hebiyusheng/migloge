package com.zkr.excprodatacomment.entity;

import com.zkr.excprodatacomment.myinterface.excelRescoure;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiuGang
 * @date 2021/3/2 - 17:26
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcelPOJO {
    @excelRescoure(value = "字段")
    private String cloumns;
    @excelRescoure(value = "注释")
    private String zhushi;
}
