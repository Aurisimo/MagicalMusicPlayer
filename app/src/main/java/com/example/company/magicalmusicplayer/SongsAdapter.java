package com.example.company.magicalmusicplayer;

import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SongsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<Song> songs;

    public SongsAdapter(List<Song> songs) {
        this.songs = songs;
    }

    public class SongsViewHolder extends RecyclerView.ViewHolder {

        public ConstraintLayout itemView;

        public SongsViewHolder(@NonNull ConstraintLayout itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        ConstraintLayout itemView = (ConstraintLayout)LayoutInflater.from(parent.getContext()).inflate(R.layout.item_song, parent, false);
        SongsViewHolder viewHolder = new SongsViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Song song = songs.get(i);

        SongImageView songImageView = viewHolder.itemView.findViewById(R.id.songImageView_songitem_image);
        songImageView.setTag(song.getAlbumImageResid() != null ? song.getAlbumImageResid() : song.getArtistImageResid());

        TextView titleTextView = viewHolder.itemView.findViewById(R.id.textView_songitem_title);
        titleTextView.setText(song.getTitle());

        TextView artistTextView = viewHolder.itemView.findViewById(R.id.textView_songitem_artist);
        artistTextView.setText(song.getArtist());

        final int playlistLocation = i;
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), ("Pressed song: " + playlistLocation), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }
}
