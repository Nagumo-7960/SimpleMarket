package com.example.simplemartket

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.simplemartket.ui.screens.FavoriteScreen
import com.example.simplemartket.ui.screens.FavoriteScreenViewModel
import com.example.simplemartket.ui.screens.HomeScreen
import com.example.simplemartket.ui.screens.ProductDetailScreen

@Composable
fun Navigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "home") {
        composable(
            "home",
        ) {
            HomeScreen { productId ->
                Log.v("TEST", "${productId}")
                navController.navigate("detail/${productId}")
            }
        }
        composable("favorite") {
            FavoriteScreen {
                navController.navigate("favorite")
            }
        }
        composable(
            "detail/{productId}",
            arguments = listOf(
                navArgument("productId"){
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId")?:0
            ProductDetailScreen (productId)
        }
    }
}