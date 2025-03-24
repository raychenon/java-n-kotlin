package com.raychenon.javankotlin.pojo;

import java.util.Optional;

public class PersonJ {
    private String name;
    private Optional<PersonJ> father;
    private Optional<PersonJ> mother;

    public PersonJ(String name, PersonJ father, PersonJ mother) {
        this.name = name;
        this.father = Optional.ofNullable(father);
        this.mother = Optional.ofNullable(mother);
    }

    public PersonJ(String name) {
        this.name = name;
        this.father = Optional.empty();
        this.mother = Optional.empty();
    }

    public String getName() {
        return name;
    }

    public Optional<PersonJ> getFather() {
        return father;
    }

    public Optional<PersonJ> getMother() {
        return mother;
    }


}
