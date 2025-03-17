package com.raychenon.javankotlin.models

/**
 * Nested object type
 */
data class Person(
    val name: String,
    val father: Person? = null,
    val mother: Person? = null
)
