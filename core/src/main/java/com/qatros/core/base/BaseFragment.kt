package com.qatros.core.base

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

/**
 * @author rivki
 * Created 18/01/22 at 23.02
 */
abstract class BaseFragment: Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onReady(view, savedInstanceState)
        observePhase()
    }

    protected fun<T> LiveData<T>.onResult(action: (T) -> Unit){
        observe(this@BaseFragment, Observer { action(it) })
    }

    protected abstract fun onReady(view: View, savedInstanceState: Bundle?)
    protected abstract fun observePhase()
}