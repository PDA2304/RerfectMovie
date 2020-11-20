package com.example.perfectmovie.Model

import android.icu.text.CaseMap
import android.os.Parcelable
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class TopModel():Parcelable
{
    @SerializedName("results")
    @Expose
    var result : ArrayList<Json_results>? = null
}
@Parcelize
class  Json_results():Parcelable{
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

@Parcelize
class ExpectedModel():Parcelable
{
    @SerializedName("results")
    @Expose
    var result : ArrayList<Json_results>? = null
}

