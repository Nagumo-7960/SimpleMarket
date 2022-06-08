package com.example.simplemartket.ui.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.simplemartket.model.Product
import com.example.simplemartket.model.Products

@Composable
fun ProductsCard(
    products: Product,
    toDetail: (Int) -> Unit = { _ -> }
) {
    val painter = rememberImagePainter(products.imageUrl)
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                top = 20.dp,
                start = 40.dp,
                end = 40.dp,
                bottom = 20.dp
            )
            .clickable(
                enabled = true,
                onClick = {
                    toDetail(products.id)
                    Log.v("TEST", "ボタンが押された")
                }
            ),
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column() {
            Image(
                painter = painter,
                contentDescription = products.id.toString(),
                modifier = Modifier
                    .size(
                        width = 5000.dp,
                        height = 200.dp
                    )
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Log.v("TEST", "${painter.state}")
            Text(
                text = products.name,
                fontSize = 20.sp,
                modifier = Modifier.padding(
                    top = 20.dp,
                    start = 15.dp
                ),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = products.value.toString() + "円",
                fontSize = 17.sp,
                modifier = Modifier.padding(
                    top = 20.dp,
                    start = 15.dp,
                    bottom = 20.dp
                )
            )
        }
    }
}

@Composable
fun ProductCards(toDetail: (Int) -> Unit = { _ -> }) {
    for (i in 0..Products.size - 1) {
        ProductsCard(products = Products.get(i), toDetail)
        Log.d("Product", i.toString())
    }
}

@Preview
@Composable
fun PreviewProductCard() {
    val product = Products.first()
    ProductsCard(product)
}