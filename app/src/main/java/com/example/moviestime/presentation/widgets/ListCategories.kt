package com.example.moviestime.presentation.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.moviestime.presentation.utli.Dimens.MediumPadding0
import com.example.moviestime.presentation.views.movies.compnent.CustomTextCategories

@Composable
fun ListCategories(
    modifier: Modifier = Modifier,
    fakeListCategories: List<String>
) {

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(MediumPadding0)
    ) {
        items(fakeListCategories) { text ->
            CustomTextCategories(titleCategory = text)

        }
    }

}