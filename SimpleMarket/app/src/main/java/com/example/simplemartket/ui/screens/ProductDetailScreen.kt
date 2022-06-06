package com.example.simplemartket.ui.screens

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import coil.compose.rememberImagePainter
import com.example.simplemartket.model.Product
import com.example.simplemartket.model.Products

@Composable
fun ProductDetailScreen(toDetail:() -> Unit){
    Column() {
        ProductDetail(products = Products.first())
    }
}

@Composable
fun ProductDetail(products: Product){
    val painter = rememberImagePainter(products.imageUrl)
    Image(
        painter = painter,
        contentDescription = "product_image")
}