package com.qatros.movie.ui.list

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.qatros.core.base.BaseFragment
import com.qatros.core.base.DiffCallback
import com.qatros.movie.databinding.FragmentMovieBinding
import com.qatros.movie.di.inject
import javax.inject.Inject


class MovieFragment : BaseFragment() {
    @Inject lateinit var vmFactory: ViewModelProvider.Factory
    private val vm: MovieViewModel by lazy {
        ViewModelProvider(this, vmFactory).get(MovieViewModel::class.java)
    }
    private lateinit var bind: FragmentMovieBinding

    @Inject
    lateinit var diffCallback: DiffCallback
    private val movieAdapter by lazy { MovieAdapter(diffCallback) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentMovieBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        inject()
    }

    override fun onReady(view: View, savedInstanceState: Bundle?) {
//        vm.getNowPlayingList()
//        with(bind.rvMovie) {
//            layoutManager = LinearLayoutManager(activity?.applicationContext)
//            adapter = movieAdapter
//        }
    }

    override fun observePhase() {
//        vm.nowPlayingList.observeResult {
//            movieAdapter.setUserData(it)
//        }
    }
}