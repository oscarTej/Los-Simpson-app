package com.example.los_simpson_app.core

import android.app.Application
import com.example.los_simpson_app.core.di.coreModule
import com.example.los_simpson_app.core.di.featureModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SimpsonApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin(){
        startKoin{
            androidContext(this@SimpsonApplication)
         modules(
             coreModule, featureModule
         )

        }
    }
}