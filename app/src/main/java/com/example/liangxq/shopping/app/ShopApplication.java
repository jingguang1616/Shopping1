package com.example.liangxq.shopping.app;

import android.app.Application;

import com.example.httplibrary.HttpConstant;
import com.example.httplibrary.HttpGlobalConfig;
import com.tencent.bugly.crashreport.CrashReport;

import java.util.ArrayList;
import java.util.List;

import okhttp3.Interceptor;

/**
 * 项目名：Shopping
 * 包名：  com.example.liangxq.shopping.app
 * 文件名：ShopApplication
 * 创建者：liangxq
 * 创建时间：2020/8/1  14:12
 * 描述：TODO
 */
public class ShopApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HttpGlobalConfig.getInsance()
                .setBaseUrl("https://wanandroid.com/")
//                .setBaseUrl("http://169.254.39.119:8080/kotlin/")
                .setTimeout(HttpConstant.TIME_OUT)
                .setShowLog(true)
                .setTimeUnit(HttpConstant.TIME_UNIT)
                .initReady(this);
        CrashReport.initCrashReport(getApplicationContext(), "880798d0c3", true);
//        CrashReport.testJavaCrash();
    }
}
