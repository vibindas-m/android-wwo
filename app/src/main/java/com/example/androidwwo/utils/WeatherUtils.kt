package com.example.androidwwo.utils

import com.example.androidwwo.data.LocationResult
import com.example.androidwwo.data.SearchResponse
import com.example.androidwwo.room.LocationData

object WeatherUtils {
    private fun getLocationDataFromResponse(locationResult: LocationResult): LocationData {

        val areaName: String = locationResult.areaName.firstOrNull()?.value ?: ""
        val country = locationResult.country.firstOrNull()?.value ?: ""
        val region = locationResult.region.firstOrNull()?.value ?: ""
        return LocationData(areaName, country, region)
    }

    fun getListLocationDataFromResult(searchResponse: SearchResponse?): ArrayList<LocationData> {
        val listLocationData: ArrayList<LocationData> = arrayListOf()
        searchResponse?.search_api?.result?.map {
            listLocationData.add(getLocationDataFromResponse(it))
        }

        return listLocationData
    }

    fun checkCountAndFindDeleteItem(value: ArrayList<LocationData>?): LocationData? {
        return if ((value?.size ?: 0) >= 10) {
            value?.firstOrNull()
        } else {
            null
        }
    }
}