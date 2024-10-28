package com.example.moviestime.domain.pagingSource

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.moviestime.domain.model.movies_model.ResultModel
import com.example.moviestime.domain.repository.MoviesRepository

class MoviesPaging(
    val repository: MoviesRepository,
    val categoryId: String,
    val language: String
) : PagingSource<Int, ResultModel>(
) {
    override fun getRefreshKey(state: PagingState<Int, ResultModel>): Int? {
        return null
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ResultModel> {
        return try {
            val page = params.key ?: 1
            val response =
                repository.getMovies(language = language, page = page, genresId = categoryId)
            LoadResult.Page(
                data = response.moviesList,
                prevKey = if (page == 1) null else page.minus(1),
                nextKey = if (response.moviesList.isEmpty()) null else page.plus(1)

            )


        } catch (e: Exception) {
            LoadResult.Error(e)
        }

    }
}