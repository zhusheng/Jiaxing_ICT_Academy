package com.huatec.day5_16.service;

import com.huatec.day5_16.model.GoodsEntity;
import com.huatec.day5_16.model.HttpResult;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by think on 2018/5/16.
 */

public interface GoodsService {
    /**
     * 获取商品详情
     * @param id
     * @return
     */
    @GET("goods/{id}")
    Call<HttpResult<GoodsEntity>> getGoodsDetail(@Path("id") int id);

    /**
     * 查找商品
     * @param input
     * @return
     */
    @FormUrlEncoded
    @POST("goods/find")
    Call<HttpResult<List<GoodsEntity>>> getGoods(@Field("input") String input);
}
