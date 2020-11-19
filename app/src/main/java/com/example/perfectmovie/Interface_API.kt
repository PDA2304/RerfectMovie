package com.example.perfectmovie

import com.example.perfectmovie.Model.ViewModel
import retrofit2.Call
import retrofit2.http.GET

interface Interface_API {
    @GET("top_rated?&api_key=${BuildConfig.API_KEY}")
    fun getTop_Movie(): Call<ViewModel>
}