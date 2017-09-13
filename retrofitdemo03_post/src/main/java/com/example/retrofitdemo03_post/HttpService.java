package com.example.retrofitdemo03_post;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 创建日期：2017/9/13 on 下午3:02
 * 描述:POST注解标注当前的请求为Post请求
 * 作者:yangliang
 */
public interface HttpService {


     /*
    @POST("/majax.action?method=getGiftList")
    Call<GiftBean> queryGiftList(@Query("pageno")int pageno);
     */

    //接口：       http://www.1688wan.com/majax.action?method=getGiftList
    //baseUrl：   http://www.1688wan.com/
    //补全url：    /majax.action?method=getGiftList
    //post参数:   pageno=1

    @POST("/majax.action?method=getGiftList")
    Call<JavaBean> queryData(@Query("pageno") int pageno);
}
