package com.example.rockpaperscissors.rockpaperscissors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Computer {

    public String computerGuess() {
        ArrayList<String> options = new ArrayList<>();
        options.addAll(Arrays.asList("rock", "paper", "scissors"));
        Collections.shuffle(options);
        return options.get(0);
    }
}
