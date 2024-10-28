package com.example.moviestime.data.mapper

import com.example.moviestime.data.data_source.remote.Category.CategoriesDto
import com.example.moviestime.data.data_source.remote.Category.ListCategoriesDto
import com.example.moviestime.domain.model.category_model.CategoriesModel
import com.example.moviestime.domain.model.category_model.ListCategoriesModel
import javax.inject.Inject

class CategoriesMapper @Inject constructor(){

    fun fromRemoteCategoryToModel(obj: CategoriesDto): CategoriesModel {
        return CategoriesModel(
            genres = obj.genres.map {
                fromRemoteListToModel(it)
            }
        )
    }

    fun fromRemoteListToModel(obj: ListCategoriesDto): ListCategoriesModel {
        return ListCategoriesModel(
            id = obj.id,
            name = obj.name
        )
    }
}