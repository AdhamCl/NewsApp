package com.example.newsapp.data.remote

import com.example.newsapp.data.remote.dataToObject.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("everything")
        suspend fun getNews(
        @Query("page") page: Int,
        @Query("sources") sources: String,
        @Query("apiKey") apiKey: String,
        ): NewsResponse
}