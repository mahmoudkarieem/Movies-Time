package com.example.moviestime.data.data_source.remote

import com.example.moviestime.data.data_source.remote.Category.CategoriesDto
import com.example.moviestime.data.data_source.remote.Movies.MoviesDto
import com.example.moviestime.util.Constants.API_KEY
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {

    @GET("genre/movie/")
    suspend fun getCategories(
        @Query("language") language: String = "en", @Query("api_key") apiKey: String = API_KEY
    ): CategoriesDto

    @GET("discover/movie")
    suspend fun getMovies(
        @Query("language") language: String = "en",
        @Query("api_key") apiKey: String = API_KEY,
        @Query("page") page: Int,
        @Query("with_genres")genresId:String


    ): MoviesDto
}