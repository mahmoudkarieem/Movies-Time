package com.example.moviestime.presentation.views.Home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.moviestime.presentation.theme.MoviesTimeTheme
import com.example.moviestime.presentation.utli.Dimens.ImageHomeHeight
import com.example.moviestime.presentation.utli.Dimens.MediumPadding1
import com.example.moviestime.presentation.views.Home.preview.listFakeMovies
import com.example.moviestime.presentation.widgets.ImageCustom
import com.example.moviestime.presentation.widgets.ListTendingMovies

@Composable
fun HomeView(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .background(color = MaterialTheme.colorScheme.background)
            .fillMaxSize()

            .padding(MediumPadding1)
    ) {
        Spacer(modifier = Modifier.height(MediumPadding1))
        Row(modifier = Modifier.padding(top = MediumPadding1)) {
            Text(
                modifier = Modifier,
                text = "Stream",
                style = MaterialTheme.typography.displaySmall,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                modifier = Modifier.padding(start = 4.dp),
                text = "Everywhere",
                style = MaterialTheme.typography.displaySmall,
                color = MaterialTheme.colorScheme.secondary

            )
        }
        Spacer(modifier = Modifier.height(MediumPadding1))
        ImageCustom(
            imageUrl = "https://img.freepik.com/free-photo/3d-rendering-person-watching-movie-with-popcorn_23-2151169440.jpg?t=st=1729930961~exp=1729934561~hmac=74cd773b479e11eff965f9f64c9d7fa98622cf3fe3f26f97cb592ddf79008141&w=740",
            modifier = Modifier.height(ImageHomeHeight)
        )
        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
            modifier = Modifier.padding(start = 4.dp),
            text = "Trending",
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.secondary

        )
        Spacer(modifier = Modifier.height(MediumPadding1))

        ListTendingMovies(fakeMoviesList = listFakeMovies)

    }
}

@Preview
@Composable
private fun PreviewHomeView() {
    MoviesTimeTheme {
        HomeView()
    }

}
