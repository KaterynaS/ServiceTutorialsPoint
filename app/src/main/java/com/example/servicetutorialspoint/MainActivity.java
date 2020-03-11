package com.example.servicetutorialspoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//https://www.tutorialspoint.com/how-to-play-background-music-in-android-app

public class MainActivity extends AppCompatActivity {

    Button playSoundButton;
    Button stopSoundButton;
    Button goToSecondActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handleButtons();

    }

    private void handleButtons() {

        goToSecondActivityButton = findViewById(R.id.go_to_second_activity_button);
        goToSecondActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(second);
            }
        });

        playSoundButton = findViewById(R.id.play_sound_button);
        playSoundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BackgroundSoundService.class);
                startService(intent);
            }
        });

        stopSoundButton = findViewById(R.id.stop_sound_button);
        stopSoundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BackgroundSoundService.class);
                stopService(intent);
            }
        });
    }



}