package com.qatros.cobamodule

import android.os.Bundle
import androidx.navigation.findNavController
import com.qatros.cobamodule.databinding.ActivityMainBinding
import com.qatros.core.base.BaseActivity
import com.qatros.core.base.DiffCallback
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    @Inject
    lateinit var diffCallback: DiffCallback
    private val bindLayout by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onReady(savedInstanceState: Bundle?) {
        setContentView(bindLayout.root)
    }

    override fun observePhase() {}
}