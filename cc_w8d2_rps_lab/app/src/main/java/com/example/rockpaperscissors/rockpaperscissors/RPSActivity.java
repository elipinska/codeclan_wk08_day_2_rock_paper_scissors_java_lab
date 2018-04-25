package com.example.rockpaperscissors.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RPSActivity extends AppCompatActivity {


    private TextView computerChoiceTextView;
    private TextView scoreTextView;
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
        rockButton = findViewById(R.id.rockButtonID);
        paperButton = findViewById(R.id.paperButtonID);
        scissorsButton = findViewById(R.id.scissorsButtonID);
        scoreTextView = findViewById(R.id.scoreTextView);

        game = new Game();
        computer = new Computer();


    }

    public void onRockButtonClicked(View button) {
        String computerGuess = computer.computerGuess();
        computerChoiceTextView.setText("Computer plays: " + computerGuess);
        String result = game.decideWinner("rock", computerGuess);
        String score = "You: " + game.getPlayerScore() + " Computer: " + game.getComputerScore();
        scoreTextView.setText(score);
        Intent intent = new Intent(this, ShowResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("score", score);
        startActivity(intent);
    }

    public void onPaperButtonClicked(View button) {
        String computerGuess = computer.computerGuess();
        computerChoiceTextView.setText("Computer plays: " + computerGuess);
        String result = game.decideWinner("paper", computerGuess);
        String score = "You: " + game.getPlayerScore() + " Computer: " + game.getComputerScore();
        scoreTextView.setText(score);
        Intent intent = new Intent(this, ShowResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("score", score);
        startActivity(intent);
    }

    public void onScissorsButtonClicked(View button) {
        String computerGuess = computer.computerGuess();
        computerChoiceTextView.setText("Computer plays: " + computerGuess);
        String result = game.decideWinner("scissors", computerGuess);
        String score = "You: " + game.getPlayerScore() + " Computer: " + game.getComputerScore();
        scoreTextView.setText(score);
        Intent intent = new Intent(this, ShowResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("score", score);
        startActivity(intent);
    }


}

