package com.example.stuapp.http

import com.example.stuapp.http.response.BannerResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *
 *@Auther MikuCat
 *@Time 2023/9/4
 */
interface ApiService {
    @GET("api/v2/")
    suspend fun getImg(@Query("r18") r18 : Boolean ):BannerResponse
}