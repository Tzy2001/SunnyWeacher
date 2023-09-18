package com.example.sunnyweacher.logic.network

import android.telecom.Call
import com.example.sunnyweacher.SunnyWeacherApplication
import com.example.sunnyweacher.logic.model.DailyResponse
import com.example.sunnyweacher.logic.model.RealtimeRespone
import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherService {
    @GET("v2.5/${SunnyWeacherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeacher(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeRespone>

    @GET("v2.5/${SunnyWeacherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailyResponse>
}