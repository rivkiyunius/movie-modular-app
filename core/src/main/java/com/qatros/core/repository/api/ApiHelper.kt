package com.qatros.core.repository.api

import com.qatros.core.repository.model.MoviesResponse
import io.reactivex.rxjava3.core.Observable

/**
 * @author rivki
 * Created 10/01/22 at 12.14
 */
interface ApiHelper {
    fun getNowPlayingMovie(): Observable<List<MoviesResponse>>
    fun getUpcomingMovie(): Observable<List<MoviesResponse>>
}