package com.qatros.cobamodule

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qatros.cobamodule.databinding.FragmentMainBinding
import com.qatros.core.base.BaseFragment
import com.qatros.core.base.DiffCallback
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * @author rivki
 * Created 20/01/22 at 21.02
 */
@AndroidEntryPoint
class MainFragment: BaseFragment() {
    @Inject lateinit var diffCallback: DiffCallback
    private lateinit var bindLayout: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindLayout = FragmentMainBinding.inflate(inflater, container, false)
        return bindLayout.root
    }

    override fun onReady(view: View, savedInstanceState: Bundle?) {

    }

    override fun observePhase() {

    }
}