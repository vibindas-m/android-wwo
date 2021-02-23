package com.example.androidwwo.ui.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.androidwwo.R
import com.example.androidwwo.data.CurrentCondition
import com.example.androidwwo.data.WeatherResponse
import com.example.androidwwo.extension.loadImageUrl
import com.example.androidwwo.model.Event
import org.koin.androidx.viewmodel.ext.android.sharedViewModel
import com.example.androidwwo.model.Result
import kotlinx.android.synthetic.main.fragment_weather_details.*

class WeatherDetailsFragment : Fragment() {

    private val viewModel: MainViewModel by sharedViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather_details, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        bindLocationList()
    }

    private fun bindLocationList() {
        viewModel.weatherDetailsEvent.observe(viewLifecycleOwner, weatherDetailsObserver)
        viewModel.currentWeather.observe(viewLifecycleOwner, Observer {
            it?.let {
                bindUI(it)
            }
        })


        viewModel.weatherDetailsEventTrigger.postValue(Event(Unit))
    }

    private fun bindUI(it: CurrentCondition) {
        weatherDescription.text = it.weatherDesc.firstOrNull()?.value ?: ""
        cityName.text = viewModel.selectedLocation.value
        temperature.text = String.format(getString(R.string._celsius), it.temp_C)
        humidity.text = String.format(getString(R.string.humidity), it.humidity)
        weatherImage.loadImageUrl(it.weatherIconUrl.firstOrNull()?.value ?: "")
    }

    private val weatherDetailsObserver = Observer<Result<WeatherResponse>> {
        if (it is Result.Loading) {
            Log.d("Weather", "Loading")
            progressBar.show()
        } else {
            progressBar.hide()
            if (it is Result.Success) {
                Log.d("Weather", "Success")
                viewModel.updateWeatherDetails(it.data)
            }
            if (it is Result.Failure) {
                Log.d("Weather", "Failed")
            }
        }
    }
}
