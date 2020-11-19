package com.example.perfectmovie.Model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ViewModel()
{
    @SerializedName("vote_average")
    @Expose
    var vote_average : String? = null

    @SerializedName("title")
    @Expose
    var title : String? = null

    @SerializedName("release_date")
    @Expose
    var release_date : String? = null

    @SerializedName("poster_path")
    @Expose
    var poster_path : String? = null

    @SerializedName("overview")
    @Expose
    var overview : String? = null

}