package com.example.moviestime.presentation.views.movies.compnent

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import com.example.moviestime.presentation.utli.Dimens.MediumPadding1

@Composable
fun CustomTextCategories(
    modifier: Modifier = Modifier,
    titleCategory: String
) {
    Text(
        modifier = Modifier.padding(start = MediumPadding1),
        text = titleCategory,
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.secondary,
        fontWeight = FontWeight.SemiBold
    )

}