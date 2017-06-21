package com.example.android.m_struct;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);


        // Find the View that shows the Home menu
        TextView home = (TextView) findViewById(R.id.menu_home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(RadioActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });


        // Find the View that shows the Discover menu
        TextView discover = (TextView) findViewById(R.id.menu_discover);

        // Set a click listener on that View
        discover.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discoverIntent = new Intent(RadioActivity.this, DiscoverActivity.class);
                startActivity(discoverIntent);
            }
        });


        // Find the View that shows the Playlist menu
        TextView playlist = (TextView) findViewById(R.id.menu_playlist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(RadioActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

    }
}
