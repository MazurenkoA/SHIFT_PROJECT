package com.example.shift_project.model.request

import com.google.gson.annotations.SerializedName

class Simple(
    @SerializedName("id") val id: String,
    @SerializedName("name") val name: String
)