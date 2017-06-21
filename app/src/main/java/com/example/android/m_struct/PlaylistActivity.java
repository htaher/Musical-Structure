package com.example.android.m_struct;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);


        // Find the View that shows the Discover menu
        TextView home = (TextView) findViewById(R.id.menu_home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(PlaylistActivity.this, MainActivity.class);
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
                Intent discoverIntent = new Intent(PlaylistActivity.this, DiscoverActivity.class);
                startActivity(discoverIntent);
            }
        });


        // Find the View that shows the Radio menu
        TextView radio = (TextView) findViewById(R.id.menu_radio);

        // Set a click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(PlaylistActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });


        // Find the View that shows the Playlist 1
        TextView playlist1 = (TextView) findViewById(R.id.playlist1);

        // Set a click listener on that View
        playlist1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlist1Intent = new Intent(PlaylistActivity.this, MusicListActivity.class);
                startActivity(playlist1Intent);
            }
        });

        // Find the View that shows the Playlist 2
        TextView playlist2 = (TextView) findViewById(R.id.playlist2);

        // Set a click listener on that View
        playlist2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlist2Intent = new Intent(PlaylistActivity.this, MusicListActivity.class);
                startActivity(playlist2Intent);
            }
        });

        // Find the View that shows the Playlist 3
        TextView playlist3 = (TextView) findViewById(R.id.playlist3);

        // Set a click listener on that View
        playlist3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlist3Intent = new Intent(PlaylistActivity.this, MusicListActivity.class);
                startActivity(playlist3Intent);
            }
        });

        // Find the View that shows the Playlist 4
        TextView playlist4 = (TextView) findViewById(R.id.playlist4);

        // Set a click listener on that View
        playlist4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlist4Intent = new Intent(PlaylistActivity.this, MusicListActivity.class);
                startActivity(playlist4Intent);
            }
        });
    }
}
