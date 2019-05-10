package com.example.company.magicalmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ImageView backImageView = findViewById(R.id.imageView_playlist_back);
        backImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();
        Playlist playlist = (Playlist)intent.getSerializableExtra(Constants.EXTRA_NAME_PLAYLIST);

        ImageView plalistImageView = findViewById(R.id.imageView_playlist_image);
        plalistImageView.setImageResource(playlist.getImageResid());

        TextView titleTextView = findViewById(R.id.textView_playlist_title);
        titleTextView.setText(playlist.getTitle());

        RecyclerView playlistSongsRecyclerView = findViewById(R.id.recyclerView_playlist_songs);
        playlistSongsRecyclerView.setAdapter(new SongsAdapter(playlist.getSongs()));
        playlistSongsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        playlistSongsRecyclerView.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));
    }
}
