package com.example.simplemartket.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.simplemartket.model.Product
import com.example.simplemartket.model.Products

@Composable
fun ProductDetailScreen(toDetail: () -> Unit) {
    Column {
        ProductDetail(products = Products.first())
    }
}

@Composable
fun ProductDetail(products: Product) {
    val painter = rememberImagePainter(products.imageUrl)
    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painter = painter,
                contentDescription = "product_image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    //画像の横幅を最大にすることで強引にサイズ調整しているので修正予定
                    .width(5000.dp)
                    .height(300.dp)
            )
        }
    }

}

@Preview
@Composable
fun PreviewProductDetail() {
    ProductDetailScreen {

    }
}