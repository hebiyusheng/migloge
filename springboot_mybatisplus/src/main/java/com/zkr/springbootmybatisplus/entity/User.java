package com.zkr.springbootmybatisplus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LG
 * @date 2020/12/18 - 14:35
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}