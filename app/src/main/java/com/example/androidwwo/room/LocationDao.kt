package com.example.androidwwo.room

import androidx.room.*

@Dao
interface LocationDao{
    @Query("SELECT * FROM location_data")
    fun getAll(): List<LocationData>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg locationData: LocationData)

    @Delete
    fun delete(locationData: LocationData)

}