package com.zkr.springbootredis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author LiuGang
 * @date 2021/2/20 - 14:41
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
