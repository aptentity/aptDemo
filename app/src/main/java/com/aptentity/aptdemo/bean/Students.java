package com.aptentity.aptdemo.bean;

import com.aptentity.autoparcel.AutoParcel;

/**
 * Created by gulliver on 2017/12/5.
 */

@AutoParcel
public class Students {
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
