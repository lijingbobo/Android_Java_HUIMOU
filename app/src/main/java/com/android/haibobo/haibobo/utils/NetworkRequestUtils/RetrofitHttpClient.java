package com.android.haibobo.haibobo.utils.NetworkRequestUtils;

import okhttp3.OkHttpClient;

/**
 * Created by lijingbo on 2017/11/28.
 */

public class RetrofitHttpClient {
    private static RetrofitHttpClient instance;

    private OkHttpClient.Builder builder;

    public RetrofitHttpClient() {
        builder = new OkHttpClient.Builder();
    }

    public static RetrofitHttpClient getInstance() {

        if (instance == null) {
            synchronized (RetrofitHttpClient.class) {
                if (instance == null) {
                    instance = new RetrofitHttpClient();
                }
            }

        }
        return instance;
    }


    public OkHttpClient.Builder getBuilder() {
        return builder;
    }


}
