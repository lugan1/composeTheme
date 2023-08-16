package com.example.composethemestudy.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composethemestudy.view.DetailScreen
import com.example.composethemestudy.view.HomeScreen

@Composable
fun NavContainer() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("detail") {
            DetailScreen()
        }
    }
}
