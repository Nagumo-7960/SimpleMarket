package com.example.simplemartket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.simplemartket.model.BottomNavItem
import com.example.simplemartket.ui.components.BottomNavigationBar
import com.example.simplemartket.ui.theme.SimpleMartketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Navigation(navController = navController)

            Scaffold(
                topBar = { TopAppBar() },
                bottomBar = {
                    BottomNavigationBar(
                        items = listOf(
                            BottomNavItem(
                                name = "Home",
                                route = "home",
                                icon = Icons.Default.Search
                            ),
                            BottomNavItem(
                                name = "favorite",
                                route = "favorite",
                                icon = Icons.Default.Star
                            )
                        ),
                        navController = navController,
                        modifier = Modifier,
                        onItemClick ={
                            navController.navigate(it.route){
                                launchSingleTop = true
                            }
                        }
                    )
                }
            ) {
                Navigation(navController = navController)
            }
        }
    }
}


