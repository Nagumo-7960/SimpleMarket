package com.example.simplemartket.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.simplemartket.ui.components.ProductCards as ProductCards1

@Composable
fun HomeScreen(toHome:() -> Unit) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        item {
            ProductCards1()
        }

    }
}




