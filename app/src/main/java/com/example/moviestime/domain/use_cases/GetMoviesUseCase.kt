package com.example.moviestime.domain.use_cases

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.example.moviestime.domain.model.movies_model.ResultModel
import com.example.moviestime.domain.pagingSource.MoviesPaging
import com.example.moviestime.domain.repository.MoviesRepository
import com.example.moviestime.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetMoviesUseCase @Inject constructor(
    val repository: MoviesRepository
) {
    operator fun invoke(language: String, cateId: String): Flow<Resource<Pager<Int, ResultModel>>> =
        flow {
            try {
                emit(Resource.Loading<Pager<Int, ResultModel>>())
                val response = Pager(
                    config = PagingConfig(pageSize = 10),
                    pagingSourceFactory = {
                        MoviesPaging(
                            repository = repository, language = language,
                            categoryId = cateId
                        )
                    }
                )
            } catch (e: Exception) {
                emit(Resource.Error(message = "${e.localizedMessage} :UnExpected error"))
            }
        }
}