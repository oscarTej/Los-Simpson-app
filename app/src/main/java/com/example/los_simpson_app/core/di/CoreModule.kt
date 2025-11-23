package com.example.los_simpson_app.core.di

import org.koin.dsl.module

val coreModule = module {
    includes(providerModule)
    includes(remoteModule)
}