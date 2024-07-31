package com.nicnicdev.catsapp.di

import com.nicnicdev.catsapp.data.response.CatsGateway
import com.nicnicdev.catsapp.networkCats.BuildRetrofit
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

val networkModule = module {
    single { BuildRetrofit.build() }

    single<CatsGateway> {
        val retrofit = get<Retrofit>()
        retrofit.create<CatsGateway>()

    }
}