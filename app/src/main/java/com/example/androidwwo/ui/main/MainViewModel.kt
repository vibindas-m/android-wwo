package com.example.androidwwo.ui.main

import androidx.lifecycle.*
import com.example.androidwwo.data.*
import com.example.androidwwo.domain.LocationListUseCase
import com.example.androidwwo.domain.LocationRoomUseCase
import com.example.androidwwo.domain.WeatherUseCase
import com.example.androidwwo.model.Event
import org.koin.core.KoinComponent
import com.example.androidwwo.model.Result
import com.example.androidwwo.room.LocationData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(
    private val locationListUseCase: LocationListUseCase,
    private val weatherUseCase: WeatherUseCase,
    private val locationRoomUseCase: LocationRoomUseCase
) :
    ViewModel(), KoinComponent {

    private var _searchQuery: MutableLiveData<String> = MutableLiveData()
    val searchQuery: LiveData<String>
        get() = _searchQuery

    private var _selectedLocation: MutableLiveData<String> = MutableLiveData()
    val selectedLocation: LiveData<String>
        get() = _selectedLocation

    private var _currentWeather: MutableLiveData<CurrentCondition> = MutableLiveData()
    val currentWeather: LiveData<CurrentCondition>
        get() = _currentWeather

    private var _locationSavedDataList: MutableLiveData<ArrayList<LocationData>> = MutableLiveData()
    val locationSavedDataList: LiveData<ArrayList<LocationData>>
        get() = _locationSavedDataList

    private var _locationResponseList: MutableLiveData<ArrayList<LocationData>> = MutableLiveData()
    val locationResponseList: LiveData<ArrayList<LocationData>>
        get() = _locationResponseList

    internal val locationListEventTrigger = MutableLiveData<Event<Unit>>()
    val locationListEvent: LiveData<Result<ArrayList<LocationData>>> =
        Transformations.switchMap(locationListEventTrigger) {
            it.getContentIfNotHandled()?.let {
                locationListUseCase.execute(getLocationRequest())
            }
        }

    internal val weatherDetailsEventTrigger = MutableLiveData<Event<Unit>>()
    val weatherDetailsEvent: LiveData<Result<WeatherResponse>> =
        Transformations.switchMap(weatherDetailsEventTrigger) {
            it.getContentIfNotHandled()?.let {
                weatherUseCase.execute(getWeatherDetailsRequest())
            }
        }

    init {
        loadSavedLocationList()
    }

    private fun getLocationRequest(): LocationRequest {
        return LocationRequest(searchQuery.value ?: "", "3")
    }

    private fun getWeatherDetailsRequest(): WeatherRequest {
        return WeatherRequest(selectedLocation.value ?: "")
    }

    fun updateSearchResult(data: ArrayList<LocationData>?) {
        _locationResponseList.value = data
    }

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
        if(query.isEmpty()) {
            loadSavedLocationList()
        }
    }

    fun setSelectedLocation(location: LocationData) {
        _selectedLocation.value = location.areaName ?: ""
        saveLocationList(location)
    }

    fun updateWeatherDetails(data: WeatherResponse?) {
        data?.let {
            _currentWeather.value = it.data?.current_condition?.firstOrNull()
        }
    }

    private fun saveLocationList(locationData: LocationData) {
        viewModelScope.launch(Dispatchers.IO) {
            locationRoomUseCase.saveLocationData(locationData, locationSavedDataList.value)
        }
    }

    private fun loadSavedLocationList() {
        viewModelScope.launch(Dispatchers.IO) {
            locationRoomUseCase.getSavedLocationList()?.let {
                _locationSavedDataList.postValue(it as? ArrayList<LocationData>)
                _locationResponseList.postValue(it.reversed() as? ArrayList<LocationData>)
            }

        }
    }
}
