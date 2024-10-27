package com.example.moviestime.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.moviestime.presentation.views.Home.HomeView
import com.example.moviestime.presentation.views.movies.MoviesView
import com.example.moviestime.presentation.views.splash.SplashView

@Composable
fun NavigationHost(modifier: Modifier = Modifier) {
    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = Route.Splash.route) {

        composable(Route.Splash.route) {
            SplashView(navController = navController)
        }
        composable(Route.Home.route) {
            HomeView(navController = navController)
        }
        composable(Route.Watch.route) {
            MoviesView(navHostController = navController)
        }


    }

}