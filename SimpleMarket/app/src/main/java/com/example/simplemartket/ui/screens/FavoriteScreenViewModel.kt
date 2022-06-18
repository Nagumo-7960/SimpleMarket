package com.example.simplemartket.ui.screens

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simplemartket.model.Product

class FavoriteScreenViewModel: ViewModel(){
    private val _favoriteState = MutableLiveData(false)
    val favoriteState:LiveData<Boolean>get() = _favoriteState

    fun changeFavoriteState(){
        if(_favoriteState.value==true) _favoriteState.value=false
        else _favoriteState.value=true
    }
}