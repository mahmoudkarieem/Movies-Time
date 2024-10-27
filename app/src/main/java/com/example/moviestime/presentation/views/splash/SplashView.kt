package com.example.moviestime.presentation.views.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.moviestime.R
import com.example.moviestime.presentation.navigation.Route
import com.example.moviestime.presentation.utli.Dimens.MediumPadding4
import kotlinx.coroutines.delay

@Composable
fun SplashView(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = MediumPadding4),
        contentAlignment = Alignment.Center
    ) {
        Image(
            modifier = Modifier
                .clip(shape = MaterialTheme.shapes.extraLarge),
            painter = painterResource(id = R.drawable.movie_svgrepo_com__1_),
            contentDescription = null
        )
    }
LaunchedEffect(Unit) {
    delay(2000)
    navController.navigate(Route.Home.route){
        popUpTo(Route.Splash.route)
    }


}

}

