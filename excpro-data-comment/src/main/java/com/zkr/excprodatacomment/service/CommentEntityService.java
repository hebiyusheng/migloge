package com.zkr.excprodatacomment.service;

import com.zkr.excprodatacomment.entity.Blongtext;
import com.zkr.excprodatacomment.entity.CommentEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/2/26 - 16:27
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
public interface CommentEntityService {
    List<CommentEntity> listcomment(String tablesName);
    void setColumnCommentMessage(CommentEntity commentEntity,@Param("tableName") String tableName);
    List<Blongtext> getblogtext();
    List<Blongtext> blongtextall(String tablesName);
    void updateCloumnMessage(Blongtext blongtext);
}
