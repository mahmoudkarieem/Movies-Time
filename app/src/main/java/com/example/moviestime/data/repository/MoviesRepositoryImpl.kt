package com.example.moviestime.data.repository

import com.example.moviestime.data.data_source.remote.MoviesApi
import com.example.moviestime.data.mapper.MoviesMapper
import com.example.moviestime.domain.model.movies_model.MoviesModel
import com.example.moviestime.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesRepositoryImpl@Inject constructor(
    private val moviesApi: MoviesApi,
    private val moviesMapper: MoviesMapper

) :MoviesRepository{
    override suspend fun getMovies(language: String, page: Int, genresId: String):MoviesModel {
       return moviesMapper.fromRemoteMoviesToModel(moviesApi.getMovies(
           language=language,
           page = page,
           genresId = genresId
       ))
    }
}