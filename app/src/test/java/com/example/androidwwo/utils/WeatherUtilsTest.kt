package com.example.androidwwo.utils

import com.example.androidwwo.data.LocationResult
import com.example.androidwwo.data.NameValue
import com.example.androidwwo.data.SearchApi
import com.example.androidwwo.data.SearchResponse
import com.example.androidwwo.room.LocationData
import org.junit.Assert
import org.junit.Test

class WeatherUtilsTest {

    @Test
    fun getListLocationDataFromResultTest() {
        val result: ArrayList<LocationResult> = arrayListOf()
        result.add(
            LocationResult(
                areaName = listOf(NameValue("Singapore")),
                country = listOf(NameValue("Singapore")), region = listOf(NameValue("")),
                latitude = "1.293",
                longitude = "103.856",
                population = "3547809",
                weatherUrl = listOf(NameValue("https://www.worldweatheronline.com/v2/weather.aspx?q=1.2931,103.8558"))
            )
        )

        val searchResponse = SearchResponse(search_api = SearchApi(result = result), data = null)

        Assert.assertEquals(
            arrayListOf<LocationData>(),
            WeatherUtils.getListLocationDataFromResult(null)
        )
        Assert.assertEquals(
            arrayListOf(LocationData("Singapore", "Singapore", "")),
            WeatherUtils.getListLocationDataFromResult(searchResponse)
        )

        result.add(
            LocationResult(
                areaName = listOf(NameValue("Cochin")),
                country = listOf(NameValue("India")), region = listOf(NameValue("Kerala")),
                latitude = "9.967",
                longitude = "103.856",
                population = "3547809",
                weatherUrl = listOf(NameValue("https://www.worldweatheronline.com/v2/weather.aspx?q=9.9667,76.2333"))
            )
        )
        Assert.assertEquals(
            arrayListOf(
                LocationData("Singapore", "Singapore", ""),
                LocationData("Cochin", "India", "Kerala")
            ), WeatherUtils.getListLocationDataFromResult(searchResponse)
        )
    }

    @Test
    fun checkCountAndFindDeleteItemTest(){
        Assert.assertEquals(
            null, WeatherUtils.checkCountAndFindDeleteItem(arrayListOf(
                LocationData("Singapore", "Singapore", ""),
                LocationData("Cochin", "India", "Kerala")
            ))
        )

        Assert.assertEquals(
            LocationData("Singapore", "Singapore", ""), WeatherUtils.checkCountAndFindDeleteItem(arrayListOf(
                LocationData("Singapore", "Singapore", ""),
                LocationData("Cochin", "India", "Kerala"),
                LocationData("Kuwait", "Kuwait", "Al Kuwayt"),
                LocationData("USA", "UAS", ""),
                LocationData("UAE", "UAE", ""),
                LocationData("Germany", "Germany", "Germany"),
                LocationData("Oman", "Oman", "Gulf"),
                LocationData("Bangkok", "Thailand", "Krung Thep"),
                LocationData("Kulai", "Malaysia", "Johor"),
                LocationData("Spain", "Spain", "")
            ))
        )
    }
}