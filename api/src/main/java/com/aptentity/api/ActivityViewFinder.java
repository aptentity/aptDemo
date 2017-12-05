package com.aptentity.api;

import android.app.Activity;
import android.view.View;

/**
 * Created by gulliver on 2017/12/5.
 */

public class ActivityViewFinder implements ViewFinder{
    @Override
    public View findView(Object object, int id) {
        return ((Activity) object).findViewById(id);
    }
}
