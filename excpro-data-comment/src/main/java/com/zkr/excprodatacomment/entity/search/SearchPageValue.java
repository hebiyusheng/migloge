package com.zkr.excprodatacomment.entity.search;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiuGang
 * @date 2021/3/4 - 17:42
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchPageValue {
    /**
     * 检索安全码
     */
    private String secariryCode;
    /**
     * 检索特殊字符
     */
    private String searchStr;
    /**
     * 替换的字符
     */
    private String thStr;
    /**
     * 数据库
     */
    private String searclDatabases;
}
