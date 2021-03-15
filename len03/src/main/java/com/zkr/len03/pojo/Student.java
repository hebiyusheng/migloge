package com.zkr.len03.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author LiuGang
 * @date 2021/2/18 - 15:08
 * @Motto "何必余生、及时行乐、Good luck mi"
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors
public class Student implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer stuid;
    private String stuname;
    private String stuaddress;
    @TableLogic
    private Integer deletid;
}
