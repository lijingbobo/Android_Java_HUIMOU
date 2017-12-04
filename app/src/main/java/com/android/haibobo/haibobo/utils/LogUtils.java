package com.android.haibobo.haibobo.utils;
import com.android.haibobo.haibobo.MyApplication;
import com.orhanobut.logger.Logger;

/**
 * Created by lijingbo on 2017/11/27.
 */

public class LogUtils {
    public static boolean IsDebug = MyApplication.IsDebug;
    public static void v(String str){
        if (IsDebug){
            Logger.v(str);
        }
    }
    public static void d(String str){
        if (IsDebug){
            Logger.d(str);
        }
    }
    public static void w(String str){
        if (IsDebug){
            Logger.w(str);
        }
    }
    public static void e(String str){
        if (IsDebug){
            Logger.e(str);
        }
    }
    public static void wtf(String str){
        if (IsDebug){
            Logger.wtf(str);
        }
    }
    public static void json(String json){
        if (IsDebug){
            Logger.json(json);
        }
    }
    public static void xml(String xml){
        if (IsDebug){
            Logger.xml(xml);
        }
    }


}
