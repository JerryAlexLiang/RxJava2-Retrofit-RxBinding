package com.example.retrofitdemo02_get;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * 创建日期：2017/9/13 on 上午11:46
 * 描述:
 * 作者:yangliang
 */
public interface HttpService {

//    @GET("/majax.action?method=getWebfutureTest")
//    Call<KaiceBean> getKaice();

    // @GET("/majax.action")
//    Call<KaifuBean> getKaifu(@Query("method")String method);

    //url:      http://www.1688wan.com/majax.action?method=getJtkaifu
    //baseUrl:  http://www.1688wan.com/
    //补全url：  /majax.action
    //参数：     ?method=getJtkaifu

    @GET("/majax.action")
    Call<JavaBean> getData(@Query("method") String method);

    @GET("/majax.action?method=getJtkaifu")
    Call<JavaBean> getData2();


}
