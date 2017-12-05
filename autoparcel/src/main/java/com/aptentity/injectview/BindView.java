package com.aptentity.injectview;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by gulliver on 2017/12/5.
 */
@Retention(RetentionPolicy.CLASS)//编译时动态处理，SOURCE、RUNTIME、CLASS
@Target({ElementType.FIELD,ElementType.TYPE})//
public @interface BindView {
    int value();
}
