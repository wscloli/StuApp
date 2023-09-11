package com.example.stuapp.http

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.util.concurrent.TimeUnit

/**
 *
 *@Auther MikuCat
 *@Time 2023/9/4
 */
class RetrofitManager {

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl("https://sex.nyan.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(createOkHttpClient())
            .build()
    }

    private fun createOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .readTimeout(10, TimeUnit.SECONDS)
            .connectTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .build()
    }

    //        val apiService: ApiService by lazy { retrofit.create(ApiService::class.java) }
    fun <S> create(apiClass: Class<S>): S = retrofit.create(apiClass)
    inline fun <reified T> create(): T = create(T::class.java)


}