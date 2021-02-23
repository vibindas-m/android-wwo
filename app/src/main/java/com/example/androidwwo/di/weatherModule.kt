package com.example.androidwwo.di

import com.example.androidwwo.domain.LocationListUseCase
import com.example.androidwwo.domain.LocationRoomUseCase
import com.example.androidwwo.domain.WeatherUseCase
import com.example.androidwwo.room.LocationRoom
import com.example.androidwwo.room.WeatherDB
import com.example.androidwwo.service.ApiFactory
import com.example.androidwwo.service.WeatherRepo
import com.example.androidwwo.service.WeatherService
import com.example.androidwwo.ui.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val weatherModule = module {

    single {
        ApiFactory.retrofit().create(WeatherService::class.java)
    }

    factory {
        WeatherRepo(get())
    }


    single { WeatherDB.getWeatherDB(androidContext()) }
    single {
        val weatherDB: WeatherDB = get()
        weatherDB.locationDao()
    }
    single {
        LocationRoom(get())
    }

    single {
        LocationRoomUseCase(get())
    }

    single { LocationListUseCase(get()) }
    single { WeatherUseCase(get()) }

    viewModel {
        MainViewModel(get(), get(), get())
    }
}