package com.example.androidwwo.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "location_data")
data class LocationData(
    @PrimaryKey
    @ColumnInfo(name = "areaName") val areaName: String,
    @ColumnInfo(name = "country") val country: String?,
    @ColumnInfo(name = "region") val region: String?
)