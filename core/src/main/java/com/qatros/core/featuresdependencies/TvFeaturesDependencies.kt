package com.qatros.core.featuresdependencies

import com.qatros.core.base.DiffCallback
import com.qatros.core.repository.api.ApiHelper
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * @author rivki
 * Created 19/03/22 at 21.37
 */
@EntryPoint
@InstallIn(SingletonComponent::class)
interface TvFeaturesDependencies {
    fun datasource(): ApiHelper
    fun diffCallback(): DiffCallback
}