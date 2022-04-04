package com.qatros.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.qatros.core.base.BaseFragment
import com.qatros.core.utils.setupWithNavController
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
//        if(savedInstanceState == null){
//            initBottomNavigation()
//        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
//        initBottomNavigation()
    }

    override fun observePhase() {
    }

//    private fun initBottomNavigation(){
//        bind.bottomNavigation.setupWithNavController(
//            navGraphIds = listOf(
//                R.navigation.nav_graph_movie,
//                R.navigation.nav_graph_tv
//            ),
//            fragmentManager = childFragmentManager,
//            containerId = R.id.main_container,
//            intent = requireActivity().intent
//        )
//    }
}