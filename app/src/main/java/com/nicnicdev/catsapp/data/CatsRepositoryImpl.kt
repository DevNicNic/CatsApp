package com.nicnicdev.catsapp.data

import com.nicnicdev.catsapp.data.response.CatsGateway
import com.nicnicdev.catsapp.domain.CatsRepository
import com.nicnicdev.catsapp.domain.model.Cat

class CatsRepositoryImpl(
    private val api: CatsGateway,
): CatsRepository {
    override suspend fun getCats(): List<Cat> {
        val cats = api.getCatsResponse().map{ response->
            Cat(
                id = response.id,
                url = response.url,
                width = response.width,
                height = response.height
            )
        }
        return cats
    }

}