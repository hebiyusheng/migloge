package com.zkr.excprodatacomment.mapper;

import com.zkr.excprodatacomment.entity.search.SearchCloumnsMeaasge;
import com.zkr.excprodatacomment.entity.search.SearchPageValue;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/3/4 - 17:46
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Repository("searchCloumnsMeaasgeMapper")
public interface SearchCloumnsMeaasgeMapper {
    /**
     * 获取需要修改的表和对应表的字段
     * @return
     */
    List<SearchCloumnsMeaasge> listSerchCloumn();

    /**
     * 根据提供的信息进行修改对应的特殊字符
     * @param searchPageValue 前台数据
     * @param searchCloumnsMeaasge  表盒对应的表名
     */
    void updateSearchCloumnteshu(SearchPageValue searchPageValue,SearchCloumnsMeaasge searchCloumnsMeaasge);



}
