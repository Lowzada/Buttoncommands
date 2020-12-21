package com.example.buttoncommands;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.graphics.Typeface.*;

public class MainActivity extends AppCompatActivity {
    int textSize =12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    final TextView headercolour = findViewById(R.id.header);
    final Button blueButton = findViewById(R.id.buttonBlue);
        blueButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            headercolour.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.Lblue));
        }
        });

        final Button greenButton = findViewById(R.id.buttonGreen);
        greenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                headercolour.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.Lgreen));
            }
        });
        final Button redButton = findViewById(R.id.buttonRed);
        redButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                headercolour.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.Lred));
            }
        });
        final Button boldButton = findViewById(R.id.buttonBold);
        boldButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                headercolour.setTypeface(Typeface.defaultFromStyle(BOLD));
            }
        });
        final Button italicButton = findViewById(R.id.buttonItalic);
        italicButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                headercolour.setTypeface(Typeface.defaultFromStyle(ITALIC));
            }
        });

        final Button incButton = findViewById(R.id.buttonInc);
        incButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int incSize = textSize + 5;
                headercolour.setTextSize(incSize);
                textSize=incSize;

            }
        });
        final Button decButton = findViewById(R.id.buttonDec);
        decButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int decSize = textSize - 5;
                headercolour.setTextSize(decSize);
                textSize=decSize;
            }
        });
    }
}