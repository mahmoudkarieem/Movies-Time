package com.example.moviestime.domain.use_cases

import com.example.moviestime.domain.model.category_model.CategoriesModel
import com.example.moviestime.domain.repository.CategoryRepository
import com.example.moviestime.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetCategoriesUseCase @Inject constructor(
    val repository: CategoryRepository
) {
    operator fun invoke(language: String): Flow<Resource<CategoriesModel>> = flow {
        try {
            emit(Resource.Loading<CategoriesModel>())
            val response=repository.getCategories(lang = language)
            emit(Resource.Success<CategoriesModel>(data = response))
        } catch (e: Exception) {
            emit(Resource.Error<CategoriesModel>(message = "${e.localizedMessage} :An unexpected happend"))

        }
    }
}