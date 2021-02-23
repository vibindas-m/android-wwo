package com.example.androidwwo.viewModel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.androidwwo.data.CurrentCondition
import com.example.androidwwo.data.NameValue
import com.example.androidwwo.data.WeatherResponse
import com.example.androidwwo.data.WeatherResponseData
import com.example.androidwwo.domain.LocationListUseCase
import com.example.androidwwo.domain.LocationRoomUseCase
import com.example.androidwwo.domain.WeatherUseCase
import com.example.androidwwo.room.LocationData
import com.example.androidwwo.ui.main.MainViewModel
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MainViewModelTest {

    @Mock
    lateinit var viewModel: MainViewModel
    @Mock
    lateinit var weatherUseCase: WeatherUseCase
    @Mock
    lateinit var locationListUseCase: LocationListUseCase
    @Mock
    lateinit var locationRoomUseCase: LocationRoomUseCase

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Before
    fun setup() {
        viewModel = MainViewModel(locationListUseCase, weatherUseCase, locationRoomUseCase)
    }

    @Test
    fun viewModelPreLoadTest() {
        Assert.assertEquals(null, viewModel.searchQuery.value)
        Assert.assertEquals(null, viewModel.selectedLocation.value)
        Assert.assertEquals(null, viewModel.currentWeather.value)
        Assert.assertEquals(null, viewModel.locationSavedDataList.value)
        Assert.assertEquals(null, viewModel.locationResponseList.value)
    }

    @Test
    fun updateSearchQueryTest() {
        viewModel.updateSearchQuery("")
        Assert.assertEquals("", viewModel.searchQuery.value)
        Assert.assertEquals(null, viewModel.locationResponseList.value)
        Assert.assertEquals(null, viewModel.locationSavedDataList.value)
        viewModel.updateSearchQuery("test")
        Assert.assertEquals("test", viewModel.searchQuery.value)
    }

    @Test
    fun updateSearchResultTest() {
        viewModel.updateSearchResult(
            arrayListOf(
                LocationData("Singapore", "Singapore", "")
            )
        )
        Assert.assertEquals(
            arrayListOf(LocationData("Singapore", "Singapore", "")),
            viewModel.locationResponseList.value
        )

    }

    @Test
    fun setSelectedLocationTest() {
        viewModel.setSelectedLocation(
            LocationData("Singapore", "Singapore", "")
        )
        Assert.assertEquals(
            "Singapore",
            viewModel.selectedLocation.value
        )

    }

    @Test
    fun updateWeatherDetailsTest() {
        val currentCondition = CurrentCondition(
            observation_time = "5:11 PM",
            temp_C = "28",
            temp_F = "82",
            weatherCode = "116",
            weatherIconUrl = listOf(NameValue("http://cdn.worldweatheronline.net/images/wsymbols01_png_64/wsymbol_0004_black_low_cloud.png")),
            weatherDesc = listOf(NameValue("Partly cloudy")),
            humidity = "74"
        )
        val weatherResponse = WeatherResponse(
            WeatherResponseData(
                current_condition = listOf(
                    currentCondition
                )
            )
        )
        viewModel.updateWeatherDetails(weatherResponse)

        Assert.assertEquals(
            currentCondition,
            viewModel.currentWeather.value
        )

    }
}