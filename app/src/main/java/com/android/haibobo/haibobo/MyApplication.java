package com.android.haibobo.haibobo;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.Logger;
import com.orhanobut.logger.PrettyFormatStrategy;


/**
 * Created by lijingbo on 2017/11/27.
 */

public class MyApplication extends Application {

    public static final boolean IsDebug = true;//是否打印log
    public static final String TAG ="BedTime";

    @Override
    public void onCreate() {
        super.onCreate();
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
//                .showThreadInfo(true) //是否显示线程信息，默认是true
//                .methodCount(2)   //打印多少行，每一行对应一个方法  默认是2
//                .methodOffset(5)   //
                .tag(TAG)
                .build();
        Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy));

    }
}
