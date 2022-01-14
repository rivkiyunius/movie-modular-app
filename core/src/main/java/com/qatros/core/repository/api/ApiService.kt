package com.qatros.core.repository.api

import com.qatros.core.repository.model.MoviesResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author rivki
 * Created 10/01/22 at 12.04
 */
interface ApiService {
    @GET("movie/now_playing")
    fun getNowPlayingList(
        @Query("language") language: String,
        @Query("page") page: Int
    ): Observable<List<MoviesResponse>>

    @GET("movie/upcoming")
    fun getUpcomingMovie(
        @Query("language") language: String,
        @Query("page") page: Int
    ): Observable<List<MoviesResponse>>
}