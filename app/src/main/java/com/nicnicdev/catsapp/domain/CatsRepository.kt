package com.nicnicdev.catsapp.domain

import com.nicnicdev.catsapp.domain.model.Cat

interface CatsRepository {
    suspend fun getCats(): List<Cat>
}