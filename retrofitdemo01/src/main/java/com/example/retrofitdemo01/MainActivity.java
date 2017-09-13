package com.example.retrofitdemo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private TextView textViewTwo;
    private String result;
    private EditText editText;
    private Button button;
    private ProductHttp productHttp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text_view);
        textViewTwo = (TextView) findViewById(R.id.text_view_two);
        editText = (EditText) findViewById(R.id.ed_text);
        button = (Button) findViewById(R.id.button);

        // Url:     http://api.liwushuo.com/v2/items?gender=1&limit=20&offset=0&generation=2
        // baseUrl: http://api.liwushuo.com
        // 补全Url：    /v2/items
        // 参数：    ?gender=1&limit=20&offset=0&generation=2

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.liwushuo.com/")
                .build();

        productHttp = retrofit.create(ProductHttp.class);

        /*
        final Call<ResponseBody> responseBodyCall = productHttp.loadAll("1", "20", "0", "2");
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                    Log.d("androidxx", "onCreate: " + responseBodyCall.execute().body().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
         */
        final Call<ResponseBody> responseBodyCall = productHttp.loadAll("1", "20", "0", "2");

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    result = responseBodyCall.execute().body().string();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Log.d("tag", "run: " + result);
//                        textView.setText(result);
//                    }
//                });
//
//            }
//        }).start();

        responseBodyCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                String result = null;
                try {
                    result = response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Log.d("tag", "run: " + result);
                textView.setText(result);

            }


            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d("tag", "run: " + "解析错误~");
            }
        });




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = editText.getText().toString();
                askData(id);
            }
        });

    }

    private void askData(String id) {

        Call<ResponseBody> responseBodyCall2 = productHttp.queryDetails(id, "20", "1");

        responseBodyCall2.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                String result2 = null;
                try {
                    result2 = response.body().string();
                    if (!result2.isEmpty()) {
                        Log.d("tag", "run: " + result2);
                        textViewTwo.setText(result2);
                    } else {
                        Log.d("tag", "run: " + "数据为空");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Log.d("tag", "run: " + "解析错误~");
            }
        });
    }
}
