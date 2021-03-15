package com.zkr.excprodatacomment.service.impl;

import com.zkr.excprodatacomment.entity.TablesAllName;
import com.zkr.excprodatacomment.mapper.TablesAllNameMapper;
import com.zkr.excprodatacomment.service.TablesAllNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/3/1 - 10:26
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Service
@CacheConfig(cacheNames = "tableName")
public class TablesAllNameServiceImpl implements TablesAllNameService {

    @Autowired
    private TablesAllNameMapper tablesAllNameMapper;

    @Cacheable
    @Override
    public List<TablesAllName> getallTableName() {
        return tablesAllNameMapper.getallTableName();
    }
}
