package com.example.androidwwo.domain

import com.example.androidwwo.room.LocationData
import com.example.androidwwo.room.LocationRoom
import com.example.androidwwo.utils.WeatherUtils

class LocationRoomUseCase(
    private val locationRoom: LocationRoom
) {
    fun getSavedLocationList(): List<LocationData>? {
        return locationRoom.getAll()
    }

    fun saveLocationData(
        locationData: LocationData,
        value: ArrayList<LocationData>?
    ) {
        val toDeleteItem = WeatherUtils.checkCountAndFindDeleteItem(value)
        toDeleteItem?.let {
            deleteLocationData(it)
        }
        locationRoom.insert(locationData)
    }

    fun deleteLocationData(locationData: LocationData) {
        locationRoom.delete(locationData)
    }
}