package com.example.android.a011_my_music_player;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainAuthorActivity extends AppCompatActivity {

    //screen change buttons
    TextView screenPlayer, screenAuthor, screenLibrary;

    //intents
    Intent playerIntent;
    Intent authorIntent;
    Intent libraryIntent;

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
        setContentView(R.layout.activity_main_author);

        //setting buttons
        screenPlayer = (TextView) findViewById(R.id.screen_player);
        screenAuthor = (TextView) findViewById(R.id.screen_author);
        screenLibrary = (TextView) findViewById(R.id.screen_library);

        //setting listeners
        screenPlayer.setOnClickListener(titleListener);
        screenAuthor.setOnClickListener(titleListener);
        screenLibrary.setOnClickListener(titleListener);

        //setting intents
        playerIntent = new Intent(getBaseContext(), MainActivity.class);
        authorIntent = new Intent(getBaseContext(), MainAuthorActivity.class);
        libraryIntent = new Intent(getBaseContext(), MainLibraryActivity.class);
    }
}