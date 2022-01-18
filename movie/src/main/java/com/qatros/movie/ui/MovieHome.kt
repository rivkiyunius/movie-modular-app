package com.qatros.movie.ui

import android.os.Bundle
import androidx.activity.viewModels
import com.qatros.core.base.BaseActivity
import com.qatros.movie.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieHome : BaseActivity() {
    private val vm by viewModels<MovieViewModel>()

    override fun onReady(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_movie_home)
        vm.getNowPlayingList()
    }

    override fun observePhase() {
        vm.nowPlayingList.observeResult {

        }
    }
}