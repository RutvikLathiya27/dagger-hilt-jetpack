package com.example.dagger_hilt_compose

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * start hilt code generation
 * application level dependency injection
 */
@HiltAndroidApp
class MyApplication :Application()