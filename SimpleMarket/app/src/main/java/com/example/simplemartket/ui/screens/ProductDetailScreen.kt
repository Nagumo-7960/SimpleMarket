package com.example.simplemartket.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.simplemartket.model.Product
import com.example.simplemartket.model.Products
import com.example.simplemartket.ui.components.FavoriteButton
import com.example.simplemartket.ui.components.NonFavoriteButton

@Composable
fun ProductDetailScreen(toDetail: Int) {
    Column {
        ProductDetail(products = Products.get(toDetail),FavoriteScreenViewModel())
    }
}

@Composable
fun ProductDetail(products: Product,viewModel: FavoriteScreenViewModel) {
    val favooriteState = viewModel.fovoriteState.observeAsState()
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
        Column(
            modifier = Modifier
                .padding(
                    start = 20.dp
                )
        ) {
            Text(
                text = products.name,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "料金",
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(
                        top = 20.dp
                    )
            )
            Text(
                text = products.value.toString() + "円",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = products.explanation,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(
                        top = 20.dp
                    )
            )
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(
                    top = 20.dp
                )
                .fillMaxWidth()
        ) {
            if(products.favorite==true) FavoriteButton(products)
            if(products.favorite==false) NonFavoriteButton(products)
        }
    }


}

@Preview
@Composable
fun PreviewProductDetail() {
    ProductDetail(products = Products.first(),FavoriteScreenViewModel())
}