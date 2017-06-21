package com.example.android.m_struct;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the Discover menu
        TextView discover = (TextView) findViewById(R.id.menu_discover);

        // Set a click listener on that View
        discover.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discoverIntent = new Intent(MainActivity.this, DiscoverActivity.class);
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
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });


        // Find the View that shows the Radio menu
        TextView radio = (TextView) findViewById(R.id.menu_radio);

        // Set a click listener on that View
        radio.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent radioIntent = new Intent(MainActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });


        // Find the View that shows the Song 1 menu
        ImageView song1 = (ImageView) findViewById(R.id.home_song_1);

        // Set a click listener on that View
        song1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent song1Intent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(song1Intent);
            }
        });

        // Find the View that shows the Song 2 menu
        ImageView song2 = (ImageView) findViewById(R.id.home_song_2);

        // Set a click listener on that View
        song2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent song2Intent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(song2Intent);
            }
        });

        // Find the View that shows the Song 3 menu
        ImageView song3 = (ImageView) findViewById(R.id.home_song_3);

        // Set a click listener on that View
        song3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent song3Intent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(song3Intent);
            }
        });

        // Find the View that shows the Song 4 menu
        ImageView song4 = (ImageView) findViewById(R.id.home_song_4);

        // Set a click listener on that View
        song4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent song4Intent = new Intent(MainActivity.this, PlayActivity.class);
                startActivity(song4Intent);
            }
        });


    }
}
