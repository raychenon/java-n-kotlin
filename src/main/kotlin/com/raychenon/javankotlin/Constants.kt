package com.raychenon.javankotlin

import com.raychenon.javankotlin.models.Person

object Constants {

    @JvmStatic
    val hero = Person(
        "Luke",
        Person("Anakin", null, mother = Person("Shmi Skywalker")),
        Person("Padmé", Person("Ruwee", Person("Ruwee's father"), Person("Ruwee's mother")), Person("Jobal"))
    )
}