package com.example.shift_project.model.request

import com.example.shift_project.model.response.CategoryResponse
import com.google.gson.annotations.SerializedName

class SetBudget(
    @SerializedName("budget") val budget: String,
    @SerializedName("categoryListStirng") val categoryListString: List<String>,
    @SerializedName("consumption") val consumption: Long
)