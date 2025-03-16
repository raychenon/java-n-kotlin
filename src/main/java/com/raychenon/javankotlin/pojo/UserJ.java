package com.raychenon.javankotlin.pojo;

import lombok.*;

@EqualsAndHashCode
@ToString
@Getter
public class UserJ {
    private String firstName;
    private String lastName;
    private String id;
    @Setter
    private boolean isActive;

    public UserJ(String firstName, String lastName, String id, boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.isActive = isActive;
    }

}
