package com.qatros.tv.di

import android.content.Context
import com.qatros.core.featuresdependencies.TvFeaturesDependencies
import com.qatros.tv.ui.TvFragment
import dagger.BindsInstance
import dagger.Component

/**
 * @author rivki
 * Created 19/03/22 at 21.38
 */
@Component(dependencies = [TvFeaturesDependencies::class])
interface TvComponent {
    fun inject(fragment: TvFragment)

    @Component.Builder
    interface Builder{
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(featuresDependencies: TvFeaturesDependencies):Builder
        fun build(): TvComponent
    }
}