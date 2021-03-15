package com.zkr.excprodatacomment.mapper;

import com.zkr.excprodatacomment.entity.TablesAllName;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/3/1 - 10:14
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Repository("tablesAllNameMapper")
public interface TablesAllNameMapper {
    List<TablesAllName> getallTableName();
}
