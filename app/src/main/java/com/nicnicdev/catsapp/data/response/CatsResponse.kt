package com.nicnicdev.catsapp.data.response

import kotlinx.serialization.Serializable

@Serializable
data class CatsResponse(
    val id: String,
    val url: String,
    val width: Int,
    val height: Int
)

