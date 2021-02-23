package com.example.androidwwo.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(LocationData::class), version = 1)
abstract class WeatherDB : RoomDatabase() {
    abstract fun locationDao(): LocationDao

    companion object {
        fun getWeatherDB(context: Context): WeatherDB {
            synchronized(this) {
                return Room.databaseBuilder(
                    context,
                    WeatherDB::class.java, "database-name"
                ).build()
            }
        }
    }

}

