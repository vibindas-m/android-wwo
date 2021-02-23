package com.example.androidwwo.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.androidwwo.data.LocationRequest
import com.example.androidwwo.model.Cancellable
import com.example.androidwwo.model.Response
import com.example.androidwwo.model.Result
import com.example.androidwwo.model.UseCase
import com.example.androidwwo.room.LocationData
import com.example.androidwwo.service.WeatherRepo
import com.example.androidwwo.utils.WeatherUtils
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class LocationListUseCase(private val weatherRepo: WeatherRepo) : UseCase<LocationRequest,
        LiveData<Result<ArrayList<LocationData>>>>,
    CoroutineScope,
    Cancellable {
    var job: Job? = null
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO

    override fun execute(params: LocationRequest): LiveData<Result<ArrayList<LocationData>>> {
        val result = MutableLiveData<Result<ArrayList<LocationData>>>()
        result.postValue(Result.Loading)
        job = launch {
            val toPost = when (val response = weatherRepo.getSearchLocation(params)) {
                is Response.Success -> {
                    Result.Success(WeatherUtils.getListLocationDataFromResult(response.data))

                }
                is Response.Error -> {
                    Result.Failure(response.errorMsg)
                }
            }
            result.postValue(toPost)
        }
        return result
    }

    override fun cancel() {
        if (coroutineContext.isActive)
            job?.cancel()
    }
}