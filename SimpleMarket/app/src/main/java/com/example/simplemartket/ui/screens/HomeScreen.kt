package com.example.simplemartket.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.simplemartket.model.Products
import com.example.simplemartket.ui.components.ProductsCard as ProductsCard1

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
//        contentAlignmentlignment = Alignment.Center
    ) {
//        val product = Products.first()
        //ここで回そう！
        for (i in Products) {
            var j:Int = 0
            ProductsCard1(products = Products.get(j))
            j++
        }
//        ProductsCard(products = product)
//        Text(text = "home")
    }
}




