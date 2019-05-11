package com.example.company.magicalmusicplayer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class PlaylistsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<Playlist> playlists;

    public PlaylistsAdapter(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public class PlaylistsViewHolder extends RecyclerView.ViewHolder {

        public ConstraintLayout itemView;

        public PlaylistsViewHolder(@NonNull ConstraintLayout itemView) {
            super(itemView);
            this.itemView = itemView;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        ConstraintLayout itemView = (ConstraintLayout)LayoutInflater.from(parent.getContext()).inflate(R.layout.item_playlist, parent, false);
        PlaylistsViewHolder viewHolder = new PlaylistsViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        Playlist playlist = playlists.get(i);

        PlaylistImageView playlistImageView = viewHolder.itemView.findViewById(R.id.playlistImageView_playlistitem_image);
        playlistImageView.setTag(playlist.getImageResid());

        TextView titleTextView = viewHolder.itemView.findViewById(R.id.textView_songitem_title);
        titleTextView.setText(playlist.getTitle());

        final Playlist playlistToPass = playlist;
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), PlaylistActivity.class);
                intent.putExtra(Constants.EXTRA_NAME_PLAYLIST, playlistToPass);
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return playlists.size();
    }
}
