package com.example.androidwwo.ui.main

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidwwo.R
import com.example.androidwwo.adapter.LocationListAdapter
import com.example.androidwwo.model.Event
import com.example.androidwwo.model.Result
import com.example.androidwwo.room.LocationData
import kotlinx.android.synthetic.main.main_fragment.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class MainFragment : Fragment() {

    private val viewModel: MainViewModel by sharedViewModel()
    private lateinit var locationListAdapter: LocationListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        locationListAdapter = LocationListAdapter()
        locationListAdapter.setData(arrayListOf())
        locationListAdapter.setOnItemClickListener(object :
            LocationListAdapter.OnItemClickListener {
            override fun onClick(view: View, data: LocationData) {
                viewModel.setSelectedLocation(data)
                gotoWeatherDetails(view)
            }
        })
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        searchLocation.setOnCloseListener {
            viewModel.updateSearchQuery("")
            true
        }

        searchLocation.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            val handler = Handler()
            override fun onQueryTextChange(newText: String): Boolean {
                handler.removeCallbacksAndMessages(null)
                handler.postDelayed({
                    viewModel.updateSearchQuery(newText)
                }, 800)
                return true
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                viewModel.updateSearchQuery(query)
                return true
            }
        })

        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = locationListAdapter
        bindLocationList()
        updateError("Enter a location to search on WWO")
    }


    private val locationListObserver = Observer<Result<ArrayList<LocationData>>> {
        if (it is Result.Loading) {
            Log.d("Location", "Loading")
            progressBar.show()
        } else {
            progressBar.hide()
            if (it is Result.Success) {
                Log.d("Location", "Success")
                updateLocationList(it.data)
            }
            if (it is Result.Failure) {
                updateLocationList(arrayListOf())
                updateError(it.errorMsg)
                Log.d("Location", "Failed")
            }
        }
    }

    private fun updateLocationList(data: ArrayList<LocationData>?) {
        if (!data.isNullOrEmpty()) {
            emptySateTv?.visibility = View.GONE
        }
        viewModel.updateSearchResult(data)
    }

    private fun updateError(it: String) {
        emptySateTv?.text = it
        emptySateTv?.visibility = View.VISIBLE
    }

    private fun gotoWeatherDetails(view: View?) {
        view?.findNavController()?.navigate(R.id.action_mainFragment_to_weatherDeatilsFragment)
    }

    private fun bindLocationList() {
        viewModel.locationListEvent.observe(viewLifecycleOwner, locationListObserver)
        viewModel.locationResponseList.observe(viewLifecycleOwner, Observer {
            it?.let {
                locationListAdapter.setData(it)
                if (it.isEmpty())
                    updateError("Enter a location to search on WWO")
            }
        })

        viewModel.searchQuery.observe(viewLifecycleOwner, Observer {
            if (it.isNotEmpty()) {
                viewModel.locationListEventTrigger.postValue(Event(Unit))
            }
        })
    }

}
