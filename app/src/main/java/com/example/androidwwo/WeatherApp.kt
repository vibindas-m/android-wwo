package com.example.androidwwo

import android.app.Application
import com.example.androidwwo.di.weatherModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin


class WeatherApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {

            androidContext(this@WeatherApp)
            modules(
                listOf(
                    weatherModule
                )
            )
        }
    }
}