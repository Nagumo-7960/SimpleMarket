package com.example.simplemartket.ui.screens

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavoriteScreenViewModel : ViewModel() {
    private val _favoriteState: MutableLiveData<Boolean> = MutableLiveData<Boolean>(false)
    val favoriteState: LiveData<Boolean> get() = _favoriteState

    fun changeFavoriteState() {
        if (_favoriteState.value == true) _favoriteState.value = false
        else _favoriteState.value = true
        Log.d("favorite", "changeFavoriteStateが呼ばれる")
    }
}