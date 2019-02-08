package com.example.shift_project.model.api

import com.example.shift_project.model.request.SetBudget
import com.example.shift_project.model.response.BudgetResponse
import com.example.shift_project.model.response.CategoryResponse
import retrofit2.Call
import retrofit2.http.*

interface Api {
    @GET("/budgets")
    fun getBudget(): Call<BudgetResponse>

    @GET("/categories/{id}/")
    fun getCategory(@Path("id") gid: Int): Call<CategoryResponse>

    @POST("/test")
    fun test(@Body simple: SetBudget)
}