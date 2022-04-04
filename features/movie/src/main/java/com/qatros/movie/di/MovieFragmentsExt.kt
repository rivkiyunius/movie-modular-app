package com.qatros.movie.di

import com.qatros.core.featuresdependencies.MovieFeaturesDependencies
import com.qatros.movie.ui.list.MovieFragment
import dagger.hilt.android.EntryPointAccessors

/**
 * @author rivki
 * Created 19/03/22 at 21.48
 */

internal fun MovieFragment.inject(){
    DaggerMovieComponent.builder()
        .context(requireContext())
        .appDependencies(
            EntryPointAccessors.fromApplication(
                requireContext(), MovieFeaturesDependencies::class.java
            )
        )
        .build()
        .inject(this)
}