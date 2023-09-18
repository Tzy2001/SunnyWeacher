package com.example.sunnyweacher.logic.dao

import android.content.Context
import android.content.SharedPreferences
import android.provider.Settings.System.putString
import com.example.sunnyweacher.SunnyWeacherApplication
import com.example.sunnyweacher.logic.model.Place
import com.google.gson.Gson

object PlaceDao {
    fun savePlace(place: Place) {
        SharedPreferences().edit {
            putString("place", Gson().tojson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences.contains("place")
    private fun sharedPreferences() =
        SunnyWeacherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)
}