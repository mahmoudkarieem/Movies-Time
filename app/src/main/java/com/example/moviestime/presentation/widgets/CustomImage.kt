package com.example.moviestime.presentation.widgets


import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.moviestime.R

@Composable
fun ImageCustom(
    modifier: Modifier = Modifier,
    imageUrl: String
) {
    AsyncImage(
        modifier = modifier
            .fillMaxWidth()
            .clip(shape = MaterialTheme.shapes.extraLarge),
        model = ImageRequest.Builder(LocalContext.current)
            .data(imageUrl)
            .crossfade(true)
            .build(),
        error = painterResource(
            id = R.drawable.home
        ),
        contentDescription = null,
        contentScale = ContentScale.Crop
    )

}

