package com.qatros.tv.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qatros.core.base.BaseFragment
import com.qatros.tv.databinding.FragmentTvBinding
import com.qatros.tv.di.inject
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author rivki
 * Created 11/03/22 at 15.32
 */

class TvFragment: BaseFragment() {
    private lateinit var binding: FragmentTvBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTvBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        inject()
    }

    override fun onReady(view: View, savedInstanceState: Bundle?) {

    }

    override fun observePhase() {

    }
}