package com.zkr.excprodatacomment.service;

import com.zkr.excprodatacomment.entity.search.SearchCloumnsMeaasge;
import com.zkr.excprodatacomment.entity.search.SearchPageValue;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/3/4 - 17:47
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public interface SearchCloumnsMeaasgeService {
    List<SearchCloumnsMeaasge> listSerchCloumn();
    void updateSearchCloumnteshu(SearchPageValue searchPageValue, SearchCloumnsMeaasge searchCloumnsMeaasge);
}
