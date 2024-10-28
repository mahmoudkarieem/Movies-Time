package com.example.moviestime.domain.repository

import com.example.moviestime.domain.model.movies_model.MoviesModel

interface MoviesRepository {
    suspend fun getMovies(language: String, page: Int, genresId: String): MoviesModel
}