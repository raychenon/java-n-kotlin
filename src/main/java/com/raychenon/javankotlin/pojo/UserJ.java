package com.raychenon.javankotlin.pojo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UserJ {

    private String firstName;
    private String lastName;
    private String id;

    private boolean isActive;

    public UserJ(String firstName, String lastName, String id, boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.isActive = isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        UserJ userJ = (UserJ) object;
        return isActive == userJ.isActive && java.util.Objects.equals(firstName, userJ.firstName) && java.util.Objects.equals(lastName, userJ.lastName) && java.util.Objects.equals(id, userJ.id);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, id, isActive);
    }

}
