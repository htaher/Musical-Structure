package com.example.android.m_struct;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_list);


        // Find the View that shows the Home menu
        TextView home = (TextView) findViewById(R.id.menu_home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(MusicListActivity.this, DiscoverActivity.class);
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
                Intent discoverIntent = new Intent(MusicListActivity.this, DiscoverActivity.class);
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
                Intent playlistIntent = new Intent(MusicListActivity.this, PlaylistActivity.class);
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
                Intent radioIntent = new Intent(MusicListActivity.this, RadioActivity.class);
                startActivity(radioIntent);
            }
        });


        // This create a list of songs with the artist name, the song name and the album name
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");
        songs.add("Artist \nSong \nAlbum");


        ArrayAdapter<String> songsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);

        ListView songList = (ListView) findViewById(R.id.list_of_songs);

        songList.setAdapter(songsAdapter);
    }
}
