package com.example.android.m_struct;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DiscoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);


        // Find the View that shows the Discover menu
        TextView home = (TextView) findViewById(R.id.menu_home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(DiscoverActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });


        // Find the View that shows the Playlist menu
        TextView playlist = (TextView) findViewById(R.id.menu_playlist);

        // Set a click listener on that View
        playlist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(DiscoverActivity.this, PlaylistActivity.class);
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
                Intent radioIntent = new Intent(DiscoverActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });


        // Find the View that shows the Discover song 1
        ImageView discover1 = (ImageView) findViewById(R.id.discover_1);

        // Set a click listener on that View
        discover1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discover1Intent = new Intent(DiscoverActivity.this, PlayActivity.class);
                startActivity(discover1Intent);
            }
        });

        // Find the View that shows the Discover song 2
        ImageView discover2 = (ImageView) findViewById(R.id.discover_2);

        // Set a click listener on that View
        discover2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discover2Intent = new Intent(DiscoverActivity.this, PlayActivity.class);
                startActivity(discover2Intent);
            }
        });

        // Find the View that shows the Discover song 3
        ImageView discover3 = (ImageView) findViewById(R.id.discover_3);

        // Set a click listener on that View
        discover3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discover3Intent = new Intent(DiscoverActivity.this, PlayActivity.class);
                startActivity(discover3Intent);
            }
        });

        // Find the View that shows the Discover song 4
        ImageView discover4 = (ImageView) findViewById(R.id.discover_4);

        // Set a click listener on that View
        discover4.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discover4Intent = new Intent(DiscoverActivity.this, PlayActivity.class);
                startActivity(discover4Intent);
            }
        });

        // Find the View that shows the Discover song 5
        ImageView discover5 = (ImageView) findViewById(R.id.discover_5);

        // Set a click listener on that View
        discover5.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discover5Intent = new Intent(DiscoverActivity.this, PlayActivity.class);
                startActivity(discover5Intent);
            }
        });

        // Find the View that shows the Discover song 6
        ImageView discover6 = (ImageView) findViewById(R.id.discover_6);

        // Set a click listener on that View
        discover6.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discover6Intent = new Intent(DiscoverActivity.this, PlayActivity.class);
                startActivity(discover6Intent);
            }
        });

        // Find the View that shows the Discover song 7
        ImageView discover7 = (ImageView) findViewById(R.id.discover_7);

        // Set a click listener on that View
        discover7.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discover7Intent = new Intent(DiscoverActivity.this, PlayActivity.class);
                startActivity(discover7Intent);
            }
        });

        // Find the View that shows the Discover song 8
        ImageView discover8 = (ImageView) findViewById(R.id.discover_8);

        // Set a click listener on that View
        discover8.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discover8Intent = new Intent(DiscoverActivity.this, PlayActivity.class);
                startActivity(discover8Intent);
            }
        });

        // Find the View that shows the Discover song 9
        ImageView discover9 = (ImageView) findViewById(R.id.discover_9);

        // Set a click listener on that View
        discover9.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent discover9Intent = new Intent(DiscoverActivity.this, PlayActivity.class);
                startActivity(discover9Intent);
            }
        });


    }
}
