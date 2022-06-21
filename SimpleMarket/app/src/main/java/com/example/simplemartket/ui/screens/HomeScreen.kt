package com.example.simplemartket.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.simplemartket.ui.components.ProductCards as ProductCards1

@Composable
fun HomeScreen(toDetail:(Int) -> Unit = {_ ->}) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                bottom = 60.dp
            )
    ) {
        item {
            ProductCards1(toDetail)
        }

    }
}




