package com.example.week13

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.week13.data.SportsData
import com.example.week13.model.Sport

class SportsViewModel : ViewModel() {

    private var _currentSport: MutableLiveData<Sport> = MutableLiveData<Sport>()
    val currentSport: LiveData<Sport>
        get() = _currentSport

    private var _sportsData: ArrayList<Sport> = ArrayList()
    val sportsData: ArrayList<Sport>
        get() = _sportsData

    init {
        // Initialize the sports data.
        _sportsData = SportsData.getSportsData()
        _currentSport.value = _sportsData[0]
    }

    fun updateCurrentSport(sport: Sport) {
        _currentSport.value = sport
    }
}