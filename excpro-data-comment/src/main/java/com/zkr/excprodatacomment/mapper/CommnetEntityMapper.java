package com.zkr.excprodatacomment.mapper;

import com.zkr.excprodatacomment.entity.CommentEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author LiuGang
 * @date 2021/2/26 - 16:06
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Repository("commnetEntityMapper")
public interface CommnetEntityMapper {
    List<CommentEntity> listcomment(String tablesName);
    void setColumnCommentMessage(CommentEntity commentEntity,@Param("tableName") String tableName);
}
