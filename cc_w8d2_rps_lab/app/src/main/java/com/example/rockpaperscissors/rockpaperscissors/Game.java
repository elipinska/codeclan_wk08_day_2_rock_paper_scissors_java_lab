package com.example.rockpaperscissors.rockpaperscissors;

import java.util.HashMap;

public class Game {

    private String playerGuess;
    private String computerGuess;
    private HashMap<String, String> win;
    private int playerScore;
    private int computerScore;

    public Game() {
        this.win = new HashMap();
        win.put("rock", "scissors");
        win.put("scissors", "paper");
        win.put("paper", "rock");

        playerScore = 0;
        computerScore = 0;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public String decideWinner(String playerGuess, String computerGuess) {
        String result = "";
        if ((win.get(playerGuess)).equals(computerGuess)) {
            result = "You win by playing " + playerGuess;
            playerScore += 1;
        } else if ((playerGuess).equals(computerGuess)) {
            result = "It's a draw!";
        } else {
            result = "Computer wins by playing " + computerGuess;
            computerScore += 1;
        }

        return result;
    }

    public String showScore() {
        return "You: " + getPlayerScore() + " Computer: " + getComputerScore();
    }




}