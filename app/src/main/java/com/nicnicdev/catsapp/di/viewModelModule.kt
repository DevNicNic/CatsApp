package com.nicnicdev.catsapp.di

import com.nicnicdev.catsapp.ui.home.HomeViewModel
import org.koin.dsl.module

val viewModelModule = module {
    single { HomeViewModel(repository =  get()) }
}