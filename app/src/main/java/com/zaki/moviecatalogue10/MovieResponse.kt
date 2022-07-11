package com.zaki.moviecatalogue10

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse(
    @SerializedName("results")
    val movies : List<Movie>
) : Parcelable {
    constructor() : this(mutableListOf())
}