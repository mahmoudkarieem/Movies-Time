package com.example.moviestime.domain.repository

import com.example.moviestime.domain.model.category_model.CategoriesModel

interface CategoryRepository {
    suspend fun getCategories(lang:String,): CategoriesModel
}