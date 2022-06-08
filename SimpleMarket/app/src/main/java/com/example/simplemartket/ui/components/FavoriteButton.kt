package com.example.simplemartket.ui.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simplemartket.ui.theme.ThemeColor

@Composable
fun FavoriteButton(){
    Button(
        onClick = { /* ... */ },
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
        Icon(
            Icons.Filled.Star,
            contentDescription = "Favorite",
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
        Text("お気に入り")
    }
}

@Preview
@Composable
fun PreviewFavoriteButton(){
    FavoriteButton()
}