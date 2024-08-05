package com.nicnicdev.catsapp.data.response

import retrofit2.http.GET

interface CatsGateway {
    @GET("v1/images/search")
    suspend fun getCatsResponse(): List<CatsResponse>
}