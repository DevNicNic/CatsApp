package com.nicnicdev.catsapp.di

import com.nicnicdev.catsapp.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(repository =  get()) }
}