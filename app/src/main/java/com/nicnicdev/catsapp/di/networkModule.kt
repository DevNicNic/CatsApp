package com.nicnicdev.catsapp.di

import com.nicnicdev.catsapp.networkCats.BuildRetrofit
import org.koin.dsl.module

val networkModule = module {
    single { BuildRetrofit.build() }
}