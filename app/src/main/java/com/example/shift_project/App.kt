package com.example.shift_project

import android.app.Application
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class App : Application() {
    companion object {
        val client = OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BODY })
            .build()

        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.100.8:8080")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }
    override fun onCreate(){
        super.onCreate()
    }
}