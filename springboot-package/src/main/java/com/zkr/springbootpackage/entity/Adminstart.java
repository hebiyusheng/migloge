package com.zkr.springbootpackage.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiuGang
 * @date 2021/2/3 - 15:03
 * @Motto "何必余生、及时行乐、Good luck mi"
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Adminstart {
    private Integer id;
    private String username;
    private String password;
}
