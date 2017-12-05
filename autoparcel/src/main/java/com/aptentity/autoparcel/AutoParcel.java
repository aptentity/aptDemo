package com.aptentity.autoparcel;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by gulliver on 2017/12/5.
 */

@Target(ElementType.TYPE)// 代表在类级别上才能使用该注解
@Retention(RetentionPolicy.SOURCE)// 代表该注解只存在源代码中，编译后的字节码中不存在
public @interface AutoParcel {
}