package com.example.stuapp.http

import com.example.stuapp.http.response.BannerResponse
import retrofit2.http.GET

/**
 *
 *@Auther MikuCat
 *@Time 2023/9/4
 */
interface ApiService {

    @GET("api/v2/")
    suspend fun getImg():BannerResponse
}