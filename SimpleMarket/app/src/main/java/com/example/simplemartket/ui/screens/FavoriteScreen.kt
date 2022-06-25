package com.example.simplemartket.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.simplemartket.ui.components.ProductCards

@Composable
fun FavoriteScreen(toFavorite:() ->Unit, toDetail:(Int) -> Unit = {_ ->}) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                bottom = 60.dp
            )
    ) {
        item {
            ProductCards(toDetail)
        }

    }
}