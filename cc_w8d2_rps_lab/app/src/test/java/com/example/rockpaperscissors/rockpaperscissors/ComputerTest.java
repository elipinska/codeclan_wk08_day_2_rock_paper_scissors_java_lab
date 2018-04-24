package com.example.rockpaperscissors.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest {

    //computerGuess returns a randomised String, so the test will not always pass
    @Test
    public void computerCanPlay() {
        Computer computer = new Computer();
        assertEquals("rock", computer.computerGuess());
    }
}
