package com.raychenon.javankotlin.models

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class NestedClassTest {

    val hero = Person(
        "Luke",
        Person("Anakin", null, mother = Person("Shmi Skywalker")),
        Person("Padmé", Person("Ruwee", null, null), Person("Jobal"))
    )

    @Test
    fun findMaternalGrandMother() {
        val mother = hero.mother
        assertEquals("Padmé", mother?.name)
        // nested chaining
        assertEquals("Jobal", hero?.mother?.mother?.name)
    }


    @Test
    fun findGrandFathers() {
        assertEquals(null, hero.father?.father?.name)

        assertEquals("Ruwee", hero.mother?.father?.name)
        // scoping function let
        hero?.mother?.father?.let { assertEquals("Ruwee", it.name) }
    }


}