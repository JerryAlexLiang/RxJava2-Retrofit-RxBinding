package com.example.retrofitdemo01;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * 创建日期：2017/9/13 on 上午10:28
 * 描述:
 * 作者:yangliang
 */
public interface ProductHttp {

    // Url:     http://api.liwushuo.com/v2/items?gender=1&limit=20&offset=0&generation=2
    // baseUrl: http://api.liwushuo.com
    // 补全Url：    /v2/items
    // 参数：    ?gender=1&limit=20&offset=0&generation=2
    @GET("/v2/items")
    Call<ResponseBody> loadAll(@Query("gender") String gender, @Query("limit") String limit, @Query("offset") String offset, @Query("generation") String generation);


    //http://api.liwushuo.com/v2/channels/111/items?limit=20&gender=1&offset=0&generation=2&order_by=nowhttp://api.liwushuo.com/v2/channels/111/items?limit=20&gender=1&offset=0&generation=2&order_by=now
    //http://api.liwushuo.com/v2/channels/111/items?limit=20&gender=1
    @GET("/v2/channels/{id}/items")
    Call<ResponseBody> queryDetails(@Path("id") String id, @Query("limit") String limit, @Query("gender") String gender);

}
