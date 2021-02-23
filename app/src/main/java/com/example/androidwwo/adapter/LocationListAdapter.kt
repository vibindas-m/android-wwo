package com.example.androidwwo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidwwo.R
import com.example.androidwwo.data.LocationResult
import com.example.androidwwo.room.LocationData

class LocationListAdapter : RecyclerView.Adapter<LocationListAdapter.LocationListHolder>() {

    lateinit var listener: OnItemClickListener
    private lateinit var items: ArrayList<LocationData>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationListHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_location_item, parent, false)
        return LocationListHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: LocationListHolder, position: Int) {
        val location = items[position]

        holder.locationText.text = location.areaName ?: ""
        holder.locationText.setOnClickListener {
            listener.onClick(it, location)
        }
    }

    fun setData(list: ArrayList<LocationData>) {
        this.items = list
        notifyDataSetChanged()
    }

    interface OnItemClickListener{
        fun onClick(view: View, data: LocationData)
    }

    fun setOnItemClickListener(listener: OnItemClickListener){
        this.listener = listener
    }

    class LocationListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val locationText: TextView = itemView.findViewById(R.id.locationText)
    }
}




