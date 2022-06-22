package com.example.simplemartket.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
fun ProductDetailScreen(toDetail: Int, viewModel: FavoriteScreenViewModel) {
    //val favoriteState by viewModel.favoriteState.observeAsState(initial = false)
    Log.d("favorite", "ProductDetailScreenが呼ばれる")
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        item {
            ProductDetail(products = Products.get(toDetail), viewModel = viewModel)
        }
    }
}

@Composable
fun ProductDetail(products: Product, viewModel: FavoriteScreenViewModel) {

//    Log.d("favorite", viewModel.favoriteState.toString())
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
            if (viewModel.favoriteState.value == true) FavoriteButton(
                products){
                viewModel.changeFavoriteState()
            }
            else NonFavoriteButton(products){
                viewModel.changeFavoriteState()
            }
        }
        Column (
            modifier = Modifier
                .height(150.dp)
                ){

        }
    }



}

@Preview
@Composable
fun PreviewProductDetail() {
    ProductDetail(products = Products.first(),FavoriteScreenViewModel())
}