package com.example.lenovo.buglydemo;

import android.app.Application;
import com.tencent.bugly.crashreport.CrashReport;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.initCrashReport(getApplicationContext());
    }

}