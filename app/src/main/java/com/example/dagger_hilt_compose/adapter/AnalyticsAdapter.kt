package com.example.dagger_hilt_compose.adapter

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Inject

class AnalyticsAdapter @Inject constructor(analyticsService: AnalyticsService) {

    init {
        Log.e("TAG", "create analytics")

    }

}

@Module
@InstallIn(ActivityComponent::class)
abstract class AnalyticsModule{

    @Binds
    abstract fun bindAnalyticsService(
        analyticsServiceImpl: AnalyticsServiceImpl
    ) : AnalyticsService
}

class AnalyticsServiceImpl @Inject constructor() : AnalyticsService{

    init {
        Log.e("TAG", "Analytics Service Impl>>>>>>>")
    }

    override fun analyticsMethods() {

    }
}

interface AnalyticsService{
    fun analyticsMethods()
}

