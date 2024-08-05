package com.nicnicdev.catsapp.di

import com.nicnicdev.catsapp.data.CatsRepositoryImpl
import com.nicnicdev.catsapp.domain.CatsRepository
import org.koin.dsl.module

val dataModule = module {
    single<CatsRepository> {CatsRepositoryImpl(api = get())}
}