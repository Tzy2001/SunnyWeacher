package com.example.sunnyweacher

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeacherApplication : Application() {
    companion object {
        const val TOKEN="vII6ml0pECSG3mfS"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}