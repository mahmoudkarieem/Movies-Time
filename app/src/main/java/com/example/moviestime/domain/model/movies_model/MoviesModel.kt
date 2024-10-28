package com.example.moviestime.domain.model.movies_model

data class MoviesModel(
    val moviesList: List<ResultModel> = emptyList(),
    val page: Int,
    val totalPage: Int,
    val totalResult: Int
)
