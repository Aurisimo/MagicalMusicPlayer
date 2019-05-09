package com.example.company.magicalmusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        RecyclerView playlistSongsRecyclerView = findViewById(R.id.recyclerView_playlist_songs);

        playlistSongsRecyclerView.setAdapter(new SongsAdapter(PlaylistRepository.GetPlaylists().get(0).getSongs()));
        playlistSongsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
