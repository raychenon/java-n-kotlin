package com.raychenon.javankotlin;

import com.raychenon.javankotlin.models.Person;

class Main {

    public static void main(String[] args) {
        accessAncestors();
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

        Person greatGrandMother = hero.getMother().getMother().getMother();
        // great great grand mother
        /*
        if (greatGrandMother.getMother() == null) {

        }
        // cannot do
        if(greatGrandMother.getMother().getMother().getMother() == null) {

        }
        */

    }

    private static void println(String message) {
        System.out.println(message);
    }
}
