package com.qatros.cobamodule

import android.os.Bundle
import com.qatros.core.base.BaseActivity

class MainActivity : BaseActivity() {

    override fun onReady(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
    }

    override fun observePhase() {

    }
}