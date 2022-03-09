package com.qatros.movie.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.qatros.core.base.BaseFragment
import com.qatros.movie.R
import com.qatros.movie.databinding.FragmentMovieBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieFragment : BaseFragment() {
    private val vm by viewModels<MovieViewModel>()
    private lateinit var bind: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentMovieBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onReady(view: View, savedInstanceState: Bundle?) {
    }

    override fun observePhase() {
        vm.nowPlayingList.observeResult {

        }
    }
}