package com.example.moviestime.data.repository

import com.example.moviestime.data.data_source.remote.MoviesApi
import com.example.moviestime.data.mapper.CategoriesMapper
import com.example.moviestime.domain.model.category_model.CategoriesModel
import com.example.moviestime.domain.repository.CategoryRepository
import javax.inject.Inject

class CategoryRepositoryImpl @Inject constructor(

    private val apiMoviesApi: MoviesApi,
    private val categoriesMapper: CategoriesMapper
) : CategoryRepository {
    override suspend fun getCategories(lang: String): CategoriesModel {
        return categoriesMapper.fromRemoteCategoryToModel(apiMoviesApi.getCategories(lang))
    }
}