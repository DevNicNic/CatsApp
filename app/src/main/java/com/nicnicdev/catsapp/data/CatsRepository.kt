package com.nicnicdev.catsapp.data

import com.nicnicdev.catsapp.data.response.CatsGateway

class CatsRepository(
    private val api: CatsGateway,
) {
    suspend fun getRandomCatsImage() = api.getRandomCatsImage()
}