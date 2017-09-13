package com.example.retrofitdemo04_httputils.utils;

import com.example.retrofitdemo04_httputils.HttpService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 创建日期：2017/9/13 on 下午3:32
 * 描述:
 * 作者:yangliang
 */
public class HttpUtils {

    //url:(GET)      http://www.1688wan.com/majax.action?method=getJtkaifu
    //baseUrl:  http://www.1688wan.com/
    //补全url：  /majax.action
    //参数：     ?method=getJtkaifu

    //接口:(POST)：       http://www.1688wan.com/majax.action?method=getGiftList
    //baseUrl：   http://www.1688wan.com/
    //补全url：    /majax.action?method=getGiftList
    //post参数:   pageno=1


    private static final String BASE_URL = "http://www.1688wan.com";
    private static HttpService httpService;

    public static HttpService getInstance() {

        if (httpService == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            httpService = retrofit.create(HttpService.class);
        }

        return httpService;
    }
}
