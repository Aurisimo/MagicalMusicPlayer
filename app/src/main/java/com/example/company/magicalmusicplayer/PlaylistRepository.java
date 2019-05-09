package com.example.company.magicalmusicplayer;

import java.util.ArrayList;
import java.util.List;

public class PlaylistRepository {
    public static List<Playlist> GetPlaylists() {
        List<Playlist> playlists = new ArrayList<>();

        List<Song> songs = SongRepository.GetAllSongs();

        Playlist playlist = null;
        int songCounter = 0;
        int playlistCounter = 0;
        for (Song song : songs) {
            songCounter++;

            if (songCounter == 1) {
                playlistCounter++;
                playlist = new Playlist("Playlist " + playlistCounter,
                        song.getAlbumImageResid() != null ? song.getAlbumImageResid() : song.getArtistImageResid());
                playlists.add(playlist);
            }

            playlist.add(song);

            if (songCounter == 3){
                playlist = null;
                songCounter = 0;
            }
        }

        return playlists;
    }
}
