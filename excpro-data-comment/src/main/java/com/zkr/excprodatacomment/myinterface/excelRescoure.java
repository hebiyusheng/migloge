package com.zkr.excprodatacomment.myinterface;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author LiuGang
 * @date 2021/3/2 - 17:37
 * @Motto "何必余生、及时行乐、Good luck mi"
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface excelRescoure {
    String value() default "";//默认为空
}
