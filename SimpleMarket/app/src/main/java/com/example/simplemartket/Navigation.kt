package com.example.simplemartket

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.simplemartket.ui.screens.FavoriteScreen
import com.example.simplemartket.ui.screens.HomeScreen
import com.example.simplemartket.ui.screens.ProductDetailScreen

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen {
                navController.navigate("detail")
            }
        }
        composable("favorite") {
            FavoriteScreen{
                navController.navigate("favorite")
            }
        }
        composable("detail") {
            ProductDetailScreen{
                navController.navigate("detail")
            }
        }
    }
}