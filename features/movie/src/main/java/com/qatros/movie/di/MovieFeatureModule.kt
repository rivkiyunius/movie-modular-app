package com.qatros.movie.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.qatros.core.di.ViewModelFactory
import com.qatros.core.di.ViewModelKey
import com.qatros.movie.ui.list.MovieViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.migration.DisableInstallInCheck
import dagger.multibindings.IntoMap
import javax.inject.Singleton


/**
 * @author rivki
 * Created 23/03/22 at 14.03
 */
@Module
@DisableInstallInCheck
object MovieFeatureModule {

    @Provides
    @Singleton
    internal fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory = factory

    @Provides
    @IntoMap
    @ViewModelKey(MovieViewModel::class)
    internal fun movieViewModel(viewModel: MovieViewModel): ViewModel = viewModel
}