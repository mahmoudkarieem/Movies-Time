package com.example.moviestime.di

import com.example.moviestime.data.data_source.remote.MoviesApi
import com.example.moviestime.data.mapper.CategoriesMapper
import com.example.moviestime.data.mapper.MoviesMapper
import com.example.moviestime.data.repository.CategoryRepositoryImpl
import com.example.moviestime.data.repository.MoviesRepositoryImpl
import com.example.moviestime.domain.repository.CategoryRepository
import com.example.moviestime.domain.repository.MoviesRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Provides
    @Singleton
    fun provideRetrofit() {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    @Provides
    @Singleton
    fun provideApiInterface(retrofit: Retrofit): MoviesApi = retrofit.create(MoviesApi::class.java)

    @Provides
    @Singleton
    fun provideCategoryRepository(
      api:MoviesApi,categoriesMapper: CategoriesMapper
    ):CategoryRepository=CategoryRepositoryImpl(
        apiMoviesApi = api,
        categoriesMapper = categoriesMapper
    )
    @Provides
    @Singleton
    fun provideMoviesRepository(
        moviesApi: MoviesApi,
        mapper: MoviesMapper
    ):MoviesRepository=MoviesRepositoryImpl(
        moviesApi = moviesApi,
        moviesMapper = mapper

    )

}