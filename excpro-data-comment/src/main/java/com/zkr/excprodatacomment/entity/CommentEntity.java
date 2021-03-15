package com.zkr.excprodatacomment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author LiuGang
 * @date 2021/2/26 - 15:59
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentEntity implements Serializable {
    private String columnName;
    private String columnType;
    private String columnComment;
}
