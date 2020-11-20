package com.example.perfectmovie

import com.example.perfectmovie.Model.ExpectedModel
import com.example.perfectmovie.Model.TopModel
import retrofit2.Call
import retrofit2.http.GET

interface Interface_API {
    @GET("top_rated?&api_key=${BuildConfig.API_KEY}")
    fun getTop_Movie(): Call<TopModel>

    @GET("upcoming?&api_key=${BuildConfig.API_KEY}")
    fun getExpected_Movie(): Call<ExpectedModel>
}