package com.qatros.movie.di

import android.content.Context
import com.qatros.core.featuresdependencies.MovieFeaturesDependencies
import com.qatros.movie.ui.list.MovieFragment
import dagger.BindsInstance
import dagger.Component

/**
 * @author rivki
 * Created 11/03/22 at 19.36
 */
@Component(dependencies = [MovieFeaturesDependencies::class])
interface MovieComponent {
    fun inject(fragment: MovieFragment)

    @Component.Builder
    interface Builder{
        fun context(@BindsInstance context: Context): Builder
        fun appDependencies(movieFeaturesDependencies: MovieFeaturesDependencies): Builder
        fun build(): MovieComponent
    }
}