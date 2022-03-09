package com.qatros.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qatros.core.base.BaseFragment
import com.qatros.home.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author rivki
 * Created 08/03/22 at 20.45
 */
@AndroidEntryPoint
class HomeFragment: BaseFragment() {
    private lateinit var bind: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = FragmentHomeBinding.inflate(inflater, container, false)
        return bind.root
    }

    override fun onReady(view: View, savedInstanceState: Bundle?) {
    }

    override fun observePhase() {
    }
}