package com.zkr.excprodatacomment.service.impl;

import com.zkr.excprodatacomment.entity.search.SearchCloumnsMeaasge;
import com.zkr.excprodatacomment.entity.search.SearchPageValue;
import com.zkr.excprodatacomment.mapper.SearchCloumnsMeaasgeMapper;
import com.zkr.excprodatacomment.service.SearchCloumnsMeaasgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/3/4 - 17:47
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Service
public class SearchCloumnsMeaasgeServiceImpl implements SearchCloumnsMeaasgeService {

    @Autowired
    private SearchCloumnsMeaasgeMapper searchCloumnsMeaasgeMapper;

    @Override
    public List<SearchCloumnsMeaasge> listSerchCloumn() {
        return searchCloumnsMeaasgeMapper.listSerchCloumn();
    }

    @Transactional
    @Override
    public void updateSearchCloumnteshu(SearchPageValue searchPageValue, SearchCloumnsMeaasge searchCloumnsMeaasge) {
        searchCloumnsMeaasgeMapper.updateSearchCloumnteshu(searchPageValue,searchCloumnsMeaasge);
    }
}
