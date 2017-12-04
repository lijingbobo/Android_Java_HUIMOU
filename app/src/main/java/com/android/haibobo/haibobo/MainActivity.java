package com.android.haibobo.haibobo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.haibobo.haibobo.RetrofitDemo.DataService;
import com.android.haibobo.haibobo.utils.LogUtils;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends AppCompatActivity {
    TextView tv_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         tv_test = findViewById(R.id.tv_test);
//        LogUtils.e("打印log日志");
        retrofitDemo();
    }

    private void retrofitDemo() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.futurelab.tv/")
                .addConverterFactory(ScalarsConverterFactory.create())
//                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();
        DataService dataService = retrofit.create(DataService.class);
        Call<String> baidu = dataService.baidu("NewRecommend/Information?data=dXNlcl9pZD0wJnBhZ2U9MSZ0aW1lPTE1MTE3NjY3OTc=");
        baidu.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                LogUtils.e(response.body().toString());
                tv_test.setText(new String(response.body().toString()));
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }
}
