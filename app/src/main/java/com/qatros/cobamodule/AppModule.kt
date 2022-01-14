package com.qatros.cobamodule

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * @author rivki
 * Created 06/01/22 at 11.04
 */

@HiltAndroidApp
class AppModule: Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object{
        var instance: AppModule? = null
    }
}