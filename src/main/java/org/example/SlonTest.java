package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlonTest {

    @Test
    void teasesBackWithUsersOwnLine() {
        Slon slon = new Slon();
        String response = slon.react("Привет");
        assertTrue(response.contains("\"Привет\""));
        assertTrue(response.contains("А ты купи слона!"));
    }
    @Test
    void helpCommandReturnsGreeting() {
        Slon slon = new Slon();
        assertEquals(slon.hello(), slon.react("\\help"));
    }
    @Test
    void exitCommandIsRecognized() {
        Slon slon = new Slon();
        assertTrue(slon.exitCommand("\\exit"));
        assertFalse(slon.exitCommand("Привет"));
    }
}