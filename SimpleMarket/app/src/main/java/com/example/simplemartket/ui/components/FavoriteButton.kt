package com.example.simplemartket.ui.components

import android.util.Log
import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simplemartket.model.Product
import com.example.simplemartket.model.Products
import com.example.simplemartket.ui.theme.ThemeColor


@Composable
fun FavoriteButton(product: Product) {
    var checked = remember { mutableStateOf(false) }
    Button(
        onClick = {
            product.favorite = product.favorite == false
            Log.v("TEST-f", "${product.name}_favorite:${product.favorite}")
        },
        // Uses ButtonDefaults.ContentPadding by default
        contentPadding = PaddingValues(
            start = 20.dp,
            top = 12.dp,
            end = 20.dp,
            bottom = 12.dp
        ),
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = ThemeColor,
            contentColor = Color.White
        )
    ) {
        // Inner content including an icon and a text label
        IconToggleButton(checked = checked.value,
            onCheckedChange = { checked.value = it })
        {
            val tint = animateColorAsState(
                if (checked.value) Color(0xFFEC407A) else Color(0xFFB0BEC5)
            )
            Icon(
                Icons.Filled.Star,
                contentDescription = "Favorite",
                tint = tint.value,
                modifier = Modifier.size(50.dp)
            )

        }
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text("お気に入り")

    }
}

@Preview
@Composable
fun PreviewFavoriteButton() {
    FavoriteButton(Products.first())
}