package com.example.androidwwo.service

import com.example.androidwwo.data.SearchResponse
import com.example.androidwwo.data.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherService {

    //  http://api.worldweatheronline.com/premium/v1/weather.ashx?key=d15d4009d2dd4a549c9144338202602%20&q=palakkad&num_of_days=1&tp=3&format=json

    //http://api.worldweatheronline.com/premium/v1/search.ashx?query=pal&num_of_results=3&format=json&key=d15d4009d2dd4a549c9144338202602
    @GET("search.ashx?")
    fun search(@Query("query") query: String, @Query("num_of_results") numOfResults: String): Call<SearchResponse>


    @GET("weather.ashx?")
    fun weather(@Query("q") q: String): Call<WeatherResponse>


}