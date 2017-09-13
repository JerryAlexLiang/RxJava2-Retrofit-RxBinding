package com.example.retrofitdemo02_get;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private HttpService httpService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button_get);
        textView = (TextView) findViewById(R.id.text_view);


        //url:      http://www.1688wan.com/majax.action?method=getJtkaifu
        //baseUrl:  http://www.1688wan.com/
        //补全url：  /majax.action
        //参数：     ?method=getJtkaifu

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.1688wan.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        httpService = retrofit.create(HttpService.class);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                askData();
            }
        });

    }

    private void askData() {

        Call<JavaBean> javaBeanCall = httpService.getData("getJtkaifu");

        javaBeanCall.enqueue(new Callback<JavaBean>() {
            @Override
            public void onResponse(Call<JavaBean> call, Response<JavaBean> response) {
                for (int i = 0; i < response.body().getInfo().size(); i++) {
                    Log.d("tag", "onResponse: " + response.body().getInfo().get(i).getGname());
                    textView.append(response.body().getInfo().get(i).getGname() + "\n");
                    Toast.makeText(MainActivity.this, "====" + response.body().getInfo().get(i).getGname(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<JavaBean> call, Throwable t) {
                Log.d("tag", "run: " + "解析错误~");
            }
        });

//        httpService.getData2().enqueue(new Callback<JavaBean>() {
//            @Override
//            public void onResponse(Call<JavaBean> call, Response<JavaBean> response) {
//                for (int i = 0; i < response.body().getInfo().size(); i++) {
//                    Log.d("tag", "onResponse: " + response.body().getInfo().get(i).getGname());
//                    textView.append(response.body().getInfo().get(i).getGname() + "\n");
//                    Toast.makeText(MainActivity.this, "====" + response.body().getInfo().get(i).getGname(), Toast.LENGTH_SHORT).show();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<JavaBean> call, Throwable t) {
//                Log.d("tag", "run: " + "解析错误~");
//            }
//        });

    }
}
