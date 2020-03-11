package com.example.servicetutorialspoint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {


    Button playSoundButton;
    Button stopSoundButton;
    Button goToMainActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        handleButtons();

    }


    private void handleButtons() {

        goToMainActivityButton = findViewById(R.id.go_to_main_activity_button);
        goToMainActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(second);
            }
        });

        playSoundButton = findViewById(R.id.play_sound_button);
        playSoundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, BackgroundSoundService.class);
                startService(intent);
            }
        });

        stopSoundButton = findViewById(R.id.stop_sound_button);
        stopSoundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, BackgroundSoundService.class);
                stopService(intent);
            }
        });
    }


}
