package com.example.company.magicalmusicplayer;

public class Song {
    private String artist;
    private String title;
    private String album;
    private Integer artistImageResid;
    private Integer albumImageResid;

    public Song(String artist, String title, Integer artistImageResid) {
        this(artist, title, artistImageResid, null, null);
    }

    public Song(String artist, String title, Integer artistImageResid, String album, Integer albumImageResid) {
        this.artist = artist;
        this.title = title;
        this.album = album;
        this.artistImageResid = artistImageResid;
        this.albumImageResid = albumImageResid;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getAlbum() {
        return album;
    }

    public Integer getArtistImageResid() {
        return artistImageResid;
    }

    public Integer getAlbumImageResid() {
        return albumImageResid;
    }
}
