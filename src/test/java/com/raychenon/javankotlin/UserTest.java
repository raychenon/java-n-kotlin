package com.raychenon.javankotlin;

import com.raychenon.javankotlin.models.UserK;
import com.raychenon.javankotlin.pojo.UserJ;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testUserJ(){
        UserJ userJ = new UserJ("Raymond", "Chenon", "raychenon", true);
        // setter
        userJ.setActive(false);

        assertEquals("Raymond", userJ.getFirstName());
        assertEquals(false, userJ.isActive());
    }

    @Test
    public void testUserK(){
        // Kotlin class
        UserK userK = new UserK("Raymond", "Chenon", "raychenon", true);
        // setter
        userK.setActive(false);

        assertEquals("Raymond", userK.getFirstName());
        assertEquals(false, userK.isActive());
    }


    @Test
    public void compareUserK_and_UserJ(){
        UserJ userJ = new UserJ("Raymond", "Chenon", "raychenon", true);
        UserK userK = new UserK("Raymond", "Chenon", "raychenon", true);

        assertEquals(userJ.getFirstName(), userK.getFirstName());
        assertFalse(userJ.equals(userK));

        assertNotEquals(userJ.toString(), userK.toString());
    }

}
