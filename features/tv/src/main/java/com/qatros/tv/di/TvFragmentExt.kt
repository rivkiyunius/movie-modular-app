package com.qatros.tv.di

import com.qatros.core.featuresdependencies.TvFeaturesDependencies
import com.qatros.tv.ui.TvFragment
import dagger.hilt.android.EntryPointAccessors

/**
 * @author rivki
 * Created 19/03/22 at 21.45
 */

internal fun TvFragment.inject() {
    DaggerTvComponent.builder()
        .context(requireContext())
        .appDependencies(
            EntryPointAccessors.fromApplication(
                requireContext(), TvFeaturesDependencies::class.java
            )
        )
        .build()
        .inject(this)
}