package com.qatros.movie.repository

import com.qatros.core.repository.api.ApiHelper
import javax.inject.Inject

/**
 * @author rivki
 * Created 17/01/22 at 20.20
 */
class MovieRepository @Inject constructor(private val apiHelper: ApiHelper){
    fun getNowPlayingMovie() = apiHelper.getNowPlayingMovie()
}