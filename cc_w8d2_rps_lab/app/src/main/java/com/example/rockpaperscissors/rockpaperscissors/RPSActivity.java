package com.example.rockpaperscissors.rockpaperscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RPSActivity extends AppCompatActivity {

    private String rules;
    private TextView rulesTextView;
    private TextView computerChoiceTextView;
    private TextView resultTextView;
    private TextView scoreView;
    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;
    private Game game;
    private Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps);

        computerChoiceTextView = findViewById(R.id.computerChoiceTextView);
        resultTextView = findViewById(R.id.resultTextViewID);
        rockButton = findViewById(R.id.rockButtonID);
        paperButton = findViewById(R.id.paperButtonID);
        scissorsButton = findViewById(R.id.scissorsButtonID);
        scoreView = findViewById(R.id.scoreTextView);

        game = new Game();
        computer = new Computer();


    }

    public void onRockButtonClicked(View button) {
        String computerGuess = computer.computerGuess();
        computerChoiceTextView.setText("Computer plays: " + computerGuess);
        resultTextView.setText(game.decideWinner("rock", computerGuess));
        scoreView.setText("You: " + game.getPlayerScore() + " Computer: " + game.getComputerScore());
    }

    public void onPaperButtonClicked(View button) {
        String computerGuess = computer.computerGuess();
        computerChoiceTextView.setText("Computer plays: " + computerGuess);
        resultTextView.setText(game.decideWinner("paper", computerGuess));
        scoreView.setText("You: " + game.getPlayerScore() + " Computer: " + game.getComputerScore());

    }

    public void onScissorsButtonClicked(View button) {
        String computerGuess = computer.computerGuess();
        computerChoiceTextView.setText("Computer plays: " + computerGuess);
        resultTextView.setText(game.decideWinner("scissors", computerGuess));
        scoreView.setText("You: " + game.getPlayerScore() + " Computer: " + game.getComputerScore());
    }


}

