package com.example.numbers_kotlin.database

import com.example.numbers_kotlin.api.NumbersApi
import com.example.numbers_kotlin.api.NumbersApiService

class NumbersRepository {
    private val numbersApi: NumbersApiService = NumbersApi.createApi()

    fun getRandomNumberTrivia() = numbersApi.getRandomNumberTrivia()
}