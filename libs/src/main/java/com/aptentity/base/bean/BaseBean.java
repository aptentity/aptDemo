package com.aptentity.base.bean;

import android.os.Parcelable;

import com.baoyz.pg.PG;

/**
 * Created by gulliver on 2017/11/23.
 */

public class BaseBean {
    public Parcelable convertParcelable(){
        return PG.convertParcelable(this);
    }
}
