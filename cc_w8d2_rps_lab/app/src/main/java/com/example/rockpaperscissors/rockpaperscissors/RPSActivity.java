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
    private Game game;
    private Computer computer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rps);

        computerChoiceTextView = findViewById(R.id.computerChoiceTextView);
        scoreTextView = findViewById(R.id.scoreTextView);

        game = new Game();
        computer = new Computer();


    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("playerScore", game.getPlayerScore());
        savedInstanceState.putInt("computerScore", game.getComputerScore());

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onResume(){
        super.onResume();
        scoreTextView.setText(game.showScore());

    }

    @Override
    public void onPause(){
        super.onPause();
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
         game.setPlayerScore(savedInstanceState.getInt("playerScore"));
         game.setComputerScore(savedInstanceState.getInt("computerScore"));

    }


    public void onChoiceButtonClicked(View button) {
        String computerGuess = computer.computerGuess();
        String playerGuess = ((Button) button).getText().toString();

        computerChoiceTextView.setText("Computer plays: " + computerGuess);
        String result = game.decideWinner(playerGuess, computerGuess);
        scoreTextView.setText(game.showScore());
        Intent intent = new Intent(this, ShowResultActivity.class);
        intent.putExtra("result", result);
        intent.putExtra("score", game.showScore());
        startActivity(intent);
    }


}

