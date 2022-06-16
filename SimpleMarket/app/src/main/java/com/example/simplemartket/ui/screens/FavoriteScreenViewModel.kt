package com.example.simplemartket.ui.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavoriteScreenViewModel: ViewModel(){
    private val _favoriteState = MutableLiveData(false)
    val fovoriteState:LiveData<Boolean>get() = _favoriteState
}