package eu.tutorials.myshoppinglistapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf

class LocationViewModel {
    private val _location = mutableStateOf<LocationData?>(null)
    val location : State<LocationData?> = _location

    fun updateLocation(newLocation: LocationData){
        _location.value = newLocation
    }
}