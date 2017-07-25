package com.will.gitweather.android.util;

import android.app.Application;
import android.content.Context;

/**
 * 获取上下文 Context 的工具类
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
