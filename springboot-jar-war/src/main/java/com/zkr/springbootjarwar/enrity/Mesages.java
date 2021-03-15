package com.zkr.springbootjarwar.enrity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author LiuGang
 * @date 2021/2/23 - 16:05
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Data
@TableName(value = "user")
public class Mesages {
    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
