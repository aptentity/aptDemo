package com.aptentity.base;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

import com.aptentity.base.utils.ProcessUtil;
import com.squareup.leakcanary.LeakCanary;

/**
 * Created by gulliver on 2017/11/23.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        if (ProcessUtil.getProcessName(this).endsWith(getPackageName())) {
            if (LeakCanary.isInAnalyzerProcess(this)) {
                // This process is dedicated to LeakCanary for heap analysis.
                // You should not init your app in this process.
                return;
            }
            LeakCanary.install(this);
        }
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }
}
