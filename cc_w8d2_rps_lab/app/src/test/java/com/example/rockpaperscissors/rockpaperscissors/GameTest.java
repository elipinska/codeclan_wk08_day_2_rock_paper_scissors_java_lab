package com.example.rockpaperscissors.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Before
    public void before(){
        game = new Game();
    }

    @Test
    public void initialScoresAreZero() {
        assertEquals(0, game.getPlayerScore());
        assertEquals(0, game.getComputerScore());
    }

    @Test
    public void canDecideWinner(){
        assertEquals("You win by playing rock", game.decideWinner("rock", "scissors"));
    }

    @Test
    public void canIncreaseScore() {
        game.decideWinner("rock", "scissors");
        assertEquals(1, game.getPlayerScore());
    }
}
