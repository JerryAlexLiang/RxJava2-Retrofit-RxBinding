package com.example.retrofitdemo03_post;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements Callback<JavaBean> {

    private Button button;
    private TextView textView;
    private HttpService httpService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button_get);
        textView = (TextView) findViewById(R.id.text_view);

        //接口：       http://www.1688wan.com/majax.action?method=getGiftList
        //baseUrl：   http://www.1688wan.com/
        //补全url：    /majax.action?method=getGiftList
        //post参数:   pageno=1

        //创建Retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.1688wan.com/")
                .addConverterFactory(GsonConverterFactory.create())//用来将json字符串解析成javabean对象
                .build();

        //创建一个HttpService对象
        httpService = retrofit.create(HttpService.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askData();
            }
        });


    }

    private void askData() {
        httpService.queryData(1).enqueue(this);
    }

    @Override
    public void onResponse(Call<JavaBean> call, Response<JavaBean> response) {
        int size = response.body().getAd().size();
        for (int i = 0; i < size; i++) {
            String title = response.body().getAd().get(i).getTitle();
            Log.d("tag", "onResponse: " + title);
            Toast.makeText(this, "=====> " + title, Toast.LENGTH_SHORT).show();
            textView.append(title + "\n");
        }
    }

    @Override
    public void onFailure(Call<JavaBean> call, Throwable t) {

    }
}
