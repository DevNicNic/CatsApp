package com.nicnicdev.catsapp.di

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class CatsApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin()
    }
    private fun initializeKoin() {
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@CatsApplication)

            modules(
                networkModule,
            )
        }
    }
}