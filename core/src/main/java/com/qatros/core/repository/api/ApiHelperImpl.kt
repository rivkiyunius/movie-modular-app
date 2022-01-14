package com.qatros.core.repository.api

import com.qatros.core.repository.model.MoviesResponse
import io.reactivex.rxjava3.core.Observable
import javax.inject.Inject

/**
 * @author rivki
 * Created 10/01/22 at 12.20
 */
class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {
    override fun getNowPlayingMovie(): Observable<List<MoviesResponse>> =
        apiService.getNowPlayingList("en-Us", 1)

    override fun getUpcomingMovie(): Observable<List<MoviesResponse>> =
        apiService.getUpcomingMovie("en-US", 1)
}