package com.example.androidwwo.room

import androidx.annotation.WorkerThread

class LocationRoom constructor(private val locationDao: LocationDao) {
    @WorkerThread
    fun insert(locationData: LocationData){
        locationDao.insertAll(locationData)
    }

    @WorkerThread
    fun getAll():List<LocationData>{
        return locationDao.getAll()
    }

    @WorkerThread
    fun delete(locationData: LocationData){
        return locationDao.delete(locationData)
    }
}