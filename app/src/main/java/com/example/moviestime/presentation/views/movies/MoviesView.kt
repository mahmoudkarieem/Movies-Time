package com.example.moviestime.presentation.views.movies

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController
import com.example.moviestime.presentation.common_component.BottomNavigationBar
import com.example.moviestime.presentation.utli.Dimens.MediumPadding1
import com.example.moviestime.presentation.utli.Dimens.MediumPadding2
import com.example.moviestime.presentation.utli.Dimens.MediumPadding3
import com.example.moviestime.presentation.views.movies.preview.fakeCategoriesList
import com.example.moviestime.presentation.widgets.ListCategories
import com.example.moviestime.presentation.widgets.SearchBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoviesView(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navHostController) }

    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .background(color = MaterialTheme.colorScheme.background)
                .fillMaxSize()

                .padding(MediumPadding1)
        ) {
            Spacer(modifier = Modifier.height(MediumPadding3))
            Text(
                modifier = Modifier,
                text = "Find Movies ,Tv series, and more..",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.secondary, fontWeight = FontWeight.SemiBold

            )
            Spacer(modifier = Modifier.height(MediumPadding2))

            SearchBar(
                modifier = Modifier.clip(
                    shape = MaterialTheme.shapes.extraLarge
                ),
                onSearch = {},
            )
            Spacer(modifier = Modifier.height(MediumPadding1))
            ListCategories(fakeListCategories = fakeCategoriesList)
        }
    }
}

//@Preview
//@Composable
//private fun PreviewMoviesView() {
//    MoviesTimeTheme {
//        MoviesView()
//    }
//
//}