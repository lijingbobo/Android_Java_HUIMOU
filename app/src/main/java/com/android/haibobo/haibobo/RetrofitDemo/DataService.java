package com.android.haibobo.haibobo.RetrofitDemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by lijingbo on 2017/11/27.
 */

public interface DataService {
    @GET
    Call<String> baidu(@Url String url);
}
