package com.example.moviestime.presentation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Route(val route: String, val vector: ImageVector? = null, val title: String? = null) {
    object Splash : Route(route = "splash")
    object Home : Route(route = "HomeView", vector = Icons.Filled.Home, title = "Home")
    object Watch : Route(route = "MoviesView", vector = Icons.Default.Search, title = "Watch")
    object Profile : Route(route = "profile", vector = Icons.Default.Person, title = "Profile")
}