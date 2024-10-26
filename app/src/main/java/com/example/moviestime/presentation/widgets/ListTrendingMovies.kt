package com.example.moviestime.presentation.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.moviestime.presentation.utli.Dimens.ListHomeImageHeight
import com.example.moviestime.presentation.utli.Dimens.MediumPadding2
import com.example.moviestime.presentation.utli.Dimens.WidthImageList

@Composable
fun ListTendingMovies(
    modifier: Modifier = Modifier,
    fakeMoviesList: List<String>
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(MediumPadding2)
    ) {
        items(fakeMoviesList) { imageUrl ->
            ImageCustom(
                imageUrl = imageUrl, modifier = Modifier
                    .height(ListHomeImageHeight)
                    .width(WidthImageList)
            )

        }
    }
}