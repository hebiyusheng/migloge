package com.zkr.excprodatacomment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author LiuGang
 * @date 2021/4/26 - 17:12
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blongtext implements Serializable {
    /**
     *     C.TABLE_SCHEMA AS '库名',
     *     T.TABLE_NAME AS '表名',
     *     T.TABLE_COMMENT AS '表注释',
     *     C.COLUMN_NAME AS '列名',
     *     C.COLUMN_COMMENT AS '列注释',
     *     C.ORDINAL_POSITION AS '列的排列顺序',
     *     C.COLUMN_DEFAULT AS '默认值',
     *     C.IS_NULLABLE AS '是否为空',
     *     C.DATA_TYPE AS '数据类型',
     *     C.CHARACTER_MAXIMUM_LENGTH AS '字符最大长度',
     *     C.NUMERIC_PRECISION AS '数值精度(最大位数)',
     *     C.NUMERIC_SCALE AS '小数精度',
     *     C.COLUMN_TYPE AS '列类型',
     *     C.COLUMN_KEY 'KEY',
     *     C.EXTRA AS '额外说明'
     */
    private String table_schema;
    private String table_name;
    private String table_comment;
    private String column_name;
    private String column_comment;
    private String ordinal_position;
    private String column_default;
    private String is_nullable;
    private String data_type;
    private String character_maximum_length;
    private String numeric_precision;
    private String numeric_scale;
    private String column_type;
    private String column_key;
    private String extra;


}
