package com.example.simplemartket.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplemartket.R
import com.example.simplemartket.model.Product
import com.example.simplemartket.model.Products

@Composable
fun ProductsCard(
    products:List<Product>
){
    Card(
        modifier = Modifier
            .padding(
                top = 20.dp,
                start = 20.dp,
                end = 20.dp,
                bottom = 20.dp

            ),
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = R.drawable.grape),
                contentDescription = "fashon_watch",
                modifier = Modifier
//                    .size(
//                        width = 150.dp,
//                        height = 150.dp
//                    )
                    .clickable {

                    },
                contentScale = ContentScale.Fit
            )
            Text(
                text = products.first().name,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Text(text = products.first().value.toString()+"円")

        }
    }
}

@Preview
@Composable
fun PreviewProductCard(){
    ProductsCard(Products)
}