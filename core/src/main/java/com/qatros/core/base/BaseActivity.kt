package com.qatros.core.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

/**
 * @author rivki
 * Created 18/01/22 at 22.41
 */
abstract class BaseActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onReady(savedInstanceState)
        observePhase()
    }

    protected fun<T> LiveData<T>.observeResult(action: (T) -> Unit){
        observe(this@BaseActivity, Observer { action(it)})
    }

    protected abstract fun onReady(savedInstanceState: Bundle?)
    protected abstract fun observePhase()

}