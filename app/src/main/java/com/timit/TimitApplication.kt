package com.timit

import android.app.Application
import timber.log.Timber

class TimitApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
            Timber.d("Timber debugging logger initialized")
        }
    }
}
