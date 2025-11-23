package com.example.los_simpson_app.core.di
import com.example.los_simpson_app.BuildConfig
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.kotlinx.serialization.asConverterFactory
import java.util.concurrent.TimeUnit

val remoteModule = module  {

    val base_url = "https://thesimpsonsapi.com/"

    single{
        OkHttpClient.Builder()
            .addInterceptor (HttpLoggingInterceptor().apply {
                level = if(BuildConfig.DEBUG){
                    HttpLoggingInterceptor.Level.BODY
                }else{
                    HttpLoggingInterceptor.Level.NONE
                }
            })
            .connectTimeout(5, TimeUnit.SECONDS)
            .readTimeout(5, TimeUnit.SECONDS)
            .writeTimeout(5, TimeUnit.SECONDS)
    }

    single{
        Retrofit.Builder()
            .baseUrl(base_url)
            .client(get())
            .addConverterFactory(
                Json.asConverterFactory(
                    "application/json; charset=UTF8".toMediaType()
                )
            )
    }
}