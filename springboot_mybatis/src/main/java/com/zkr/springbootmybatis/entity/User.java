package com.zkr.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author LG
 * @date 2020/12/20 - 21:40
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private int age;
    private String email;
}
