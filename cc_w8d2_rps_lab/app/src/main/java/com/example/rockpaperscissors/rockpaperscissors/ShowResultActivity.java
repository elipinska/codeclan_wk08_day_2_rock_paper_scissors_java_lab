package com.example.rockpaperscissors.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowResultActivity extends AppCompatActivity {

    private TextView resultTextView;
    private TextView scoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);

        resultTextView = findViewById(R.id.resultTextView);
        scoreTextView = findViewById(R.id.scoreTextView);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");
        String score = extras.getString("score");

        resultTextView.setText(result);
        scoreTextView.setText(score);

    }
}
