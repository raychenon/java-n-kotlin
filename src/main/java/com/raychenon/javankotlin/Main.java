package com.raychenon.javankotlin;

import com.raychenon.javankotlin.models.Person;
import com.raychenon.javankotlin.pojo.PersonJ;

import java.util.Optional;

class Main {

    public static void main(String[] args) {
        accessAncestors();
        accessOptionals();
    }

    /**
     * Nested class
     */
    private static void accessAncestors() {
        Person hero = Constants.getHero();
        // father
        println(String.format("father name is %s", hero.getFather().getName()));
        // paternal grand-father is null
        if (hero.getFather().getFather() == null) {
            println("grandfather name is unknown");
        } else {
            println(String.format("grandfather name is %s", hero.getFather().getFather().getName()));
        }

        // mother and grand-mother
        println(String.format("mother name is %s , grandmother is %s", hero.getMother().getName(), hero.getMother().getMother().getName()));

        // great grand mother
        if (hero != null &&
                hero.getMother() != null &&
                hero.getMother().getMother() != null &&
                hero.getMother().getMother().getMother() != null) {
            println(String.format("great grand mother name is %s", hero.getMother().getMother().getMother().getName()));
        }else{
            println("No great great great grand mother");
        }

    }

    private static final PersonJ LUKE = new PersonJ("Luke", new PersonJ("Anakin", new PersonJ("Medi Clorian "), new PersonJ("Shmi")), null);


    private static void accessOptionals() {

        PersonJ luke = LUKE;

        // father, father . father
        var greatGrandFatherName = luke.getFather() // 1st
                .map(x -> x.getFather())    // 2nd
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(PersonJ::getFather)// 3rd
                .filter(Optional::isPresent)
                .map(Optional::get)
                .map(PersonJ::getName)
                        .orElse("not found");

        println(String.format("%s's great grand father ( father 3 times ) is %s", luke.getName(), greatGrandFatherName));

    }

    private static void println(String message) {
        System.out.println(message);
    }
}
