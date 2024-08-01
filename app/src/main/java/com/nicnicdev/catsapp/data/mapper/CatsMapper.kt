package com.nicnicdev.catsapp.data.mapper


import com.nicnicdev.catsapp.data.response.CatsResponse
import com.nicnicdev.catsapp.domain.model.Cat

object CatsMapper {
    fun toDomain(response: CatsResponse) = Cat(
        id = response.id,
        url = response.url,
        width = response.width,
        height = response.height

    )
}