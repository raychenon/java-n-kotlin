package com.raychenon.javankotlin



fun main(args: Array<String>) {
    accessAncestors()
}


private fun accessAncestors() {
    val hero = Constants.hero
    // father
    // ?. nullable
    println("father name is ${hero?.father?.name}")

    // !! assert non nullable
    println("father name is ${hero?.father?.name!!}")

    // paternal grand-father
    println("grandfather name is ${hero?.father?.father?.name}")

    // ?:  elvis operator
    // null  ?: default value
    println("great great grandfather name is ${hero?.father?.father?.father?.father?.name ?: "unknown"}")

    // mother and grand-mother
    println(
        "mother name is ${hero.mother!!.name} , grandmother is ${hero.mother.mother!!.name}"
    )

    // scoping function LET
    hero?.mother?.father?.let { println("mathernal grand father = ${it.name}") }
    // not accessed because of null
    hero?.mother?.father?.father?.father?.let { println("mathernal great great grand father = ${it.name}") }

    // great grand mother
    if (hero.mother.mother.mother == null) {
        println("No great great great grand mother")
    } else {
        println("great grand mother name is ${hero.mother.mother.mother.name}")
    }

    val greatGrandMother = hero.mother.mother.mother

    // great great grand mother
    /*
    if (greatGrandMother.getMother() == null) {

    }
    // cannot do
    if(greatGrandMother.getMother().getMother().getMother() == null) {

    }
    */
}
