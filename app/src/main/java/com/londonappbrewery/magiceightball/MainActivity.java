package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ballDisplay = findViewById(R.id.image_eightBall);

        int [] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        Button myButton = findViewById(R.id.askButton);
        myButton.setOnClickListener((v) -> {
            Random randomNumberGenerator = new Random();
            int number = randomNumberGenerator.nextInt(5);
            ballDisplay.setImageResource(ballArray[number]);
            Log.d("magiceightball", "The button was pressed. Number: " + number);
        });
    }
}
