package com.zkr.springbootfileupload.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author LG
 * @date 2020/12/29 - 20:07
 * @Motto "人生能有几回搏！！！Good Luck Me"
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors(chain=true)
public class Adminstart implements Serializable {
    private Integer id;
    private String username;
    private String password;
}
