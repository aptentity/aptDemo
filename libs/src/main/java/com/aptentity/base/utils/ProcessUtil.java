package com.aptentity.base.utils;

import android.app.ActivityManager;
import android.content.Context;

import java.util.List;

/**
 * @author WuPuquan
 * @version 1.0
 * @since 2017/11/16 12:00
 */

public class ProcessUtil {

    private ProcessUtil() {
        throw new AssertionError("cannot be instantiated");
    }

    /**
     * 获取当前进程的名字
     * @param cxt
     * @return
     */
    public static String getProcessName(Context cxt) {
        int pid = android.os.Process.myPid(); // Returns the identifier of this process
        ActivityManager am = (ActivityManager) cxt.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runningApps = am.getRunningAppProcesses();
        if (runningApps == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo procInfo : runningApps) {
            if (procInfo.pid == pid) {
                return procInfo.processName;
            }
        }
        return "";
    }
}
