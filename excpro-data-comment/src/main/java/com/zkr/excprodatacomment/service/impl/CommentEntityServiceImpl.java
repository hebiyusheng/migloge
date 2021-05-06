package com.zkr.excprodatacomment.service.impl;

import com.zkr.excprodatacomment.entity.Blongtext;
import com.zkr.excprodatacomment.entity.CommentEntity;
import com.zkr.excprodatacomment.mapper.CommnetEntityMapper;
import com.zkr.excprodatacomment.service.CommentEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/2/26 - 16:28
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
//@CacheConfig(cacheNames = "commentmages")
@Service
public class CommentEntityServiceImpl implements CommentEntityService {

    @Autowired
    private CommnetEntityMapper commnetEntityMapper;
    /**
     * 获取所有字段信息和注释信息
     * @return
     */
    //@Cacheable
    @Override
    public List<CommentEntity> listcomment(String tablesName) {
        return commnetEntityMapper.listcomment(tablesName);
    }

    @Transactional
    @Override
    public void setColumnCommentMessage(CommentEntity commentEntity, String tableName) {
        System.out.println("service执行....");
        commnetEntityMapper.setColumnCommentMessage(commentEntity,tableName);
    }

    @Override
    public List<Blongtext> getblogtext() {
        return commnetEntityMapper.getblogtext();
    }

    //@Cacheable
    @Override
    public List<Blongtext> blongtextall(String tablesName) {
        return commnetEntityMapper.blongtextall(tablesName);
    }

    @Transactional
    @Override
    public void updateCloumnMessage(Blongtext blongtext) {
        commnetEntityMapper.updateCloumnMessage(blongtext);
    }
}
