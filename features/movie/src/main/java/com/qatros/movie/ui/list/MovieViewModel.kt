package com.qatros.movie.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.qatros.core.base.BaseViewModel
import com.qatros.core.repository.model.MoviesResponse
import com.qatros.movie.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @author rivki
 * Created 17/01/22 at 20.47
 */

class MovieViewModel @Inject constructor(private var repository: MovieRepository): BaseViewModel() {
    private val _nowPlayingList = MutableLiveData<List<MoviesResponse>>()
    val nowPlayingList: LiveData<List<MoviesResponse>> get() = _nowPlayingList

    fun getNowPlayingList(){
        repository.getNowPlayingMovie().onResult({
            _nowPlayingList.postValue(it)
        }, {
            _isError.postValue(it.localizedMessage)
        })
    }
}