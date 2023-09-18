package com.example.sunnyweacher.logic.network

import com.example.sunnyweacher.SunnyWeacherApplication
import com.example.sunnyweacher.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${SunnyWeacherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}