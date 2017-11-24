package com.aptentity.aptdemo.bean;

import com.aptentity.base.bean.BaseBean;
import com.baoyz.pg.Parcelable;

/**
 * Created by gulliver on 2017/11/23.
 */

@Parcelable
public class User extends BaseBean {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}