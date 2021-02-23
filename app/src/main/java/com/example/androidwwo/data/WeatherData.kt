package com.example.androidwwo.data

data class LocationRequest(
    val query: String,
    val numOfResults: String
)

data class SearchResponse(
    val search_api: SearchApi?,
    val data : WeatherData?
)

data class WeatherData(
    val error: List<WeatherError>
)
data class WeatherError(
    val msg : String
)

data class SearchApi(
    val result: List<LocationResult>
)

data class LocationResult(
    val areaName: List<NameValue>,
    val country: List<NameValue>,
    val region: List<NameValue>,
    val latitude: String,
    val longitude: String,
    val population: String,
    val weatherUrl: List<NameValue>
)

data class NameValue(
    val value: String
)


data class WeatherRequest(
    val locationName: String
)

data class WeatherResponse(
    val data: WeatherResponseData?
)

data class WeatherResponseData(
    val current_condition: List<CurrentCondition>
)

data class CurrentCondition(
    val observation_time: String,
    val temp_C: String,
    val temp_F: String,
    val weatherCode: String,
    val weatherIconUrl: List<NameValue>,
    val weatherDesc: List<NameValue>,
    val humidity: String
)