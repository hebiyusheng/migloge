package com.zkr.excprodatacomment.util;

import com.zkr.excprodatacomment.entity.search.SearchCloumnsMeaasge;

import java.util.*;

/**
 * @author LiuGang
 * @date 2021/3/4 - 18:04
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public class SerachCloumnDisUtil {

    /**
     * 查询结果集去重
     * @param list
     * @return
     */
    public static List<SearchCloumnsMeaasge> removeDuplicateOrder(List<SearchCloumnsMeaasge> list){
        Set<SearchCloumnsMeaasge> set = new TreeSet<SearchCloumnsMeaasge>(new Comparator<SearchCloumnsMeaasge>() {
            @Override
            public int compare(SearchCloumnsMeaasge a, SearchCloumnsMeaasge b) {
                // 字符串则按照asicc码升序排列
                return a.getTablename().compareTo(b.getTablename());
            }
        });
        set.addAll(list);
        return new ArrayList<SearchCloumnsMeaasge>(set);
    }



}
