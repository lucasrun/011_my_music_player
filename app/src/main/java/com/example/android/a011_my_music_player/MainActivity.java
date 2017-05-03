package com.example.android.a011_my_music_player;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //music player buttons
    Button pauseButton, playButton, stopButton;

    //screen change buttons
    TextView screenPlayer, screenAuthor, screenLibrary;

    //intents
    Intent playerIntent;
    Intent authorIntent;
    Intent libraryIntent;

    //player button multi listener
    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.pause_button:
                    pauseMusic();
                    break;
                case R.id.play_button:
                    playMusic();
                    break;
                case R.id.stop_button:
                    stopMusic();
                    break;
            }
        }
    };

    //title button multi listener
    private View.OnClickListener titleListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.screen_player:
                    startActivity(playerIntent);
                    break;
                case R.id.screen_author:
                    startActivity(authorIntent);
                    break;
                case R.id.screen_library:
                    startActivity(libraryIntent);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting buttons
        pauseButton = (Button) findViewById(R.id.pause_button);
        playButton = (Button) findViewById(R.id.play_button);
        stopButton = (Button) findViewById(R.id.stop_button);
        screenPlayer = (TextView) findViewById(R.id.screen_player);
        screenAuthor = (TextView) findViewById(R.id.screen_author);
        screenLibrary = (TextView) findViewById(R.id.screen_library);

        //setting listeners
        pauseButton.setOnClickListener(buttonListener);
        playButton.setOnClickListener(buttonListener);
        stopButton.setOnClickListener(buttonListener);
        screenPlayer.setOnClickListener(titleListener);
        screenAuthor.setOnClickListener(titleListener);
        screenLibrary.setOnClickListener(titleListener);

        //setting intents
        playerIntent = new Intent(getBaseContext(), MainActivity.class);
        authorIntent = new Intent(getBaseContext(), MainAuthorActivity.class);
        libraryIntent = new Intent(getBaseContext(), MainLibraryActivity.class);
    }

    //playing music
    private void playMusic() {
    }

    //pausing music
    private void pauseMusic() {
    }

    //stopping music
    private void stopMusic() {
    }
}