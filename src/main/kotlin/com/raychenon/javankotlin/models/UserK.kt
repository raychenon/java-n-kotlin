package com.raychenon.javankotlin.models

data class UserK(
    val firstName: String,
    val lastName: String,
    val id: String,
    var isActive: Boolean,
    var middleName: String? = ""
)
