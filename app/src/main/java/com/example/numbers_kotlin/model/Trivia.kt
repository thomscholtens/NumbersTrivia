package com.example.numbers_kotlin.model

import com.google.gson.annotations.SerializedName

data class Trivia (
    @SerializedName("text") var text: String,
    @SerializedName("number") var number: Int,
    @SerializedName("found") var found: Boolean,
    @SerializedName("type") var type: String
)