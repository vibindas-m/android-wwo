package com.example.androidwwo.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.androidwwo.data.WeatherRequest
import com.example.androidwwo.data.WeatherResponse
import com.example.androidwwo.model.Cancellable
import com.example.androidwwo.model.Response
import com.example.androidwwo.model.Result
import com.example.androidwwo.model.UseCase
import com.example.androidwwo.service.WeatherRepo
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class WeatherUseCase(private val weatherRepo: WeatherRepo) : UseCase<WeatherRequest,
        LiveData<Result<WeatherResponse>>>,
    CoroutineScope,
    Cancellable {
    var job: Job? = null
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.IO

    override fun execute(params: WeatherRequest): LiveData<Result<WeatherResponse>> {
        val result = MutableLiveData<Result<WeatherResponse>>()
        result.postValue(Result.Loading)
        job = launch {
            val toPost = when (val response = weatherRepo.getWeatherDetails(params)) {
                is Response.Success -> {
                    Result.Success(response.data)
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