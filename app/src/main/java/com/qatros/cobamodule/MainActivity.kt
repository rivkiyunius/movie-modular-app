package com.qatros.cobamodule

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.dynamicfeatures.fragment.DynamicNavHostFragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.qatros.cobamodule.databinding.ActivityMainBinding
import com.qatros.core.base.BaseActivity
import com.qatros.core.base.DiffCallback
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    private val bindLayout by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onReady(savedInstanceState: Bundle?) {
        setContentView(bindLayout.root)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.main_container) as DynamicNavHostFragment
        val navController = navHostFragment.navController
        bindLayout.bottomMenu.setupWithNavController(navController)

    }

    override fun observePhase() {}
}