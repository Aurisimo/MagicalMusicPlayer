package com.example.company.magicalmusicplayer;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String title;
    private Integer imageResid;
    private List<Song> songs;

    public Playlist(String title, Integer imageResid) {
        this.title = title;
        this.imageResid = imageResid;
        this.songs = new ArrayList<>();
    }

    public Integer getImageResid() {
        return imageResid;
    }

    public String getTitle() {
        return title;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void add(Song song) {
        songs.add(song);
    }
}
