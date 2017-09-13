package com.example.retrofitdemo04_httputils;

import com.example.retrofitdemo04_httputils.bean.JavaBeanOne;
import com.example.retrofitdemo04_httputils.bean.JavaBeanTwo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 创建日期：2017/9/13 on 下午3:35
 * 描述:
 * 作者:yangliang
 */
public interface HttpService {

    //url:      http://www.1688wan.com/majax.action?method=getJtkaifu
    //baseUrl:  http://www.1688wan.com/
    //补全url：  /majax.action
    //参数：     ?method=getJtkaifu

    //接口：       http://www.1688wan.com/majax.action?method=getGiftList
    //baseUrl：   http://www.1688wan.com/
    //补全url：    /majax.action?method=getGiftList
    //post参数:   pageno=1

    @GET("/majax.action")
    Call<JavaBeanOne> queryDataByGet(@Query("method") String method);

    @POST("/majax.action?method=getGiftList")
    Call<JavaBeanTwo> queryDataByPost(@Query("pageno") int pageno);


}
