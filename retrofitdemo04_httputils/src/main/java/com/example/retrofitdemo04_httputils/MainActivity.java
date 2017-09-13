package com.example.retrofitdemo04_httputils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.retrofitdemo04_httputils.bean.JavaBeanOne;
import com.example.retrofitdemo04_httputils.bean.JavaBeanTwo;
import com.example.retrofitdemo04_httputils.utils.HttpUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonGet;
    private Button buttonPost;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGet = (Button) findViewById(R.id.button_get);
        buttonPost = (Button) findViewById(R.id.button_post);
        textView = (TextView) findViewById(R.id.text_view);

        buttonGet.setOnClickListener(this);
        buttonPost.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_get:
                askDataByGet();
                break;

            case R.id.button_post:
                askDataByPost();
                break;

            default:
                break;
        }
    }

    private void askDataByPost() {
        Call<JavaBeanTwo> javaBeanTwoCall = HttpUtils.getInstance().queryDataByPost(1);
        javaBeanTwoCall.enqueue(new Callback<JavaBeanTwo>() {
            @Override
            public void onResponse(Call<JavaBeanTwo> call, Response<JavaBeanTwo> response) {
                if (TextUtils.isEmpty(textView.getText())) {
                    int size = response.body().getAd().size();
                    for (int i = 0; i < size; i++) {
                        String name = response.body().getAd().get(i).getAppName();
                        textView.append(name + "\n");
                        Log.d("tag", "onResponse: " + name + "\n");
                    }
                } else {
                    textView.setText(null);
                    int size = response.body().getAd().size();
                    for (int i = 0; i < size; i++) {
                        String name = response.body().getAd().get(i).getAppName();
                        textView.append(name + "\n");
                        Log.d("tag", "onResponse: " + name + "\n");
                    }
                }
            }

            @Override
            public void onFailure(Call<JavaBeanTwo> call, Throwable t) {

            }
        });
    }

    private void askDataByGet() {
        Call<JavaBeanOne> javaBeanOneCall = HttpUtils.getInstance().queryDataByGet("getJtkaifu");
        javaBeanOneCall.enqueue(new Callback<JavaBeanOne>() {
            @Override
            public void onResponse(Call<JavaBeanOne> call, Response<JavaBeanOne> response) {
                if (TextUtils.isEmpty(textView.getText())) {
                    int size = response.body().getInfo().size();
                    for (int i = 0; i < size; i++) {
                        String gname = response.body().getInfo().get(i).getGname();
                        textView.append(gname + "\n");
                        Log.d("tag", "onResponse: " + gname + "\n");
                    }
                } else {
                    textView.setText(null);
                    int size = response.body().getInfo().size();
                    for (int i = 0; i < size; i++) {
                        String gname = response.body().getInfo().get(i).getGname();
                        textView.append(gname + "\n");
                        Log.d("tag", "onResponse: " + gname + "\n");
                    }
                }
            }

            @Override
            public void onFailure(Call<JavaBeanOne> call, Throwable t) {

            }
        });

    }
}
