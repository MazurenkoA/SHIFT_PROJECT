package com.example.shift_project.model.api

import com.example.shift_project.model.request.Simple
import com.example.shift_project.model.response.BudgetsResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Api {
    @GET("/categories/1")
    fun getAll(): Call<BudgetsResponse>

    @POST("/test")
    fun test(@Body simple: Simple)
}