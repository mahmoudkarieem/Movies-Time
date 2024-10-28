package com.example.moviestime.data.mapper

import com.example.moviestime.data.data_source.remote.Movies.MoviesDto
import com.example.moviestime.data.data_source.remote.Movies.ResultDto
import com.example.moviestime.domain.model.movies_model.MoviesModel
import com.example.moviestime.domain.model.movies_model.ResultModel
import javax.inject.Inject

class MoviesMapper @Inject constructor() {
    fun fromRemoteMoviesToModel(obj: MoviesDto): MoviesModel {
        return MoviesModel(
            moviesList = fromRemoteResultToModel(obj.results),
            page = obj.page,
            totalPage = obj.totalPages,
            totalResult = obj.totalResults
        )
    }

    fun fromRemoteResultToModel(obj: List<ResultDto>): List<ResultModel> {
        return obj.map {
            ResultModel(
                title = it.title,
                id = it.id,
                voteAverage = it.voteAverage,
                posterPath = it.posterPath
            )
        }
    }
}