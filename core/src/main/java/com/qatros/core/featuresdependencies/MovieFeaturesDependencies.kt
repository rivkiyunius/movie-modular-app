package com.qatros.core.featuresdependencies

import androidx.lifecycle.ViewModelProvider
import com.qatros.core.base.DiffCallback
import com.qatros.core.di.ViewModelFactory
import com.qatros.core.repository.api.ApiHelper
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * @author rivki
 * Created 11/03/22 at 19.18
 */
@EntryPoint
@InstallIn(SingletonComponent::class)
interface MovieFeaturesDependencies {
    fun datasource(): ApiHelper
    fun diffCallback(): DiffCallback
}