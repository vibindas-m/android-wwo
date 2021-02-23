package com.example.androidwwo.service

import com.example.androidwwo.data.LocationRequest
import com.example.androidwwo.data.SearchResponse
import com.example.androidwwo.data.WeatherRequest
import com.example.androidwwo.data.WeatherResponse
import com.example.androidwwo.model.Response
import retrofit2.await

class WeatherRepo constructor(private val weatherService: WeatherService) {
    suspend fun getSearchLocation(locationRequest: LocationRequest): Response<SearchResponse> {
        return try {
            val result = weatherService.search(locationRequest.query, locationRequest.numOfResults).await()
            with(result) {
                if(this.search_api != null) {
                    Response.Success(this)
                } else {
                    Response.Error(this.data?.error?.firstOrNull()?.msg ?: "")
                }
            }
        } catch (e: Exception) {
            Response.Error(e.message ?: "")
        }
    }

    suspend fun getWeatherDetails(weatherRequest: WeatherRequest): Response<WeatherResponse> {
        return try {
            val result = weatherService.weather(weatherRequest.locationName).await()
            with(result) {
                if(this.data != null) {
                    Response.Success(this)
                } else {
                    Response.Error("Failed get response")
                }
            }
        } catch (e: Exception) {
            Response.Error(e.message ?: "")
        }
    }
}