package com.example.company.magicalmusicplayer;

import java.util.ArrayList;
import java.util.List;

public class SongRepository {
    public static List<Song> GetAllSongs()
    {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song("Leonard Cohen", "In My Secret Life", R.drawable.leonard_cohen, "Ten New Songs",
                R.drawable.leonard_cohen_ten_new_songs));
        songs.add(new Song("Leonard Cohen", "A Thousand Kisses Deep", R.drawable.leonard_cohen, "Ten New Songs",
                R.drawable.leonard_cohen_ten_new_songs));

        songs.add(new Song("The Hold Steady", "She gets low in her seat when she gets high in her car", R.drawable.the_hold_steady, "Almost Killed Me",
                R.drawable.the_hold_steady_almost_killed_me));
        songs.add(new Song("The Hold Steady", "Mary got a bloody nose from sniffing margarita mix", R.drawable.the_hold_steady, "Almost Killed Me",
                R.drawable.the_hold_steady_almost_killed_me));

        songs.add(new Song("TV on the Radio", "I was a lover, before this war", R.drawable.tv_on_the_radio, "Return to Cookie Mountain",
                R.drawable.tv_on_the_radio_return_to_cookie_mountain));

        songs.add(new Song("Radiohead", "A Wolf at the Door", R.drawable.radiohead, "Hail to the Thief",
                R.drawable.radiohead_hail_to_the_thief));
        songs.add(new Song("Radiohead", "AI Will", R.drawable.radiohead, "Hail to the Thief",
                R.drawable.radiohead_hail_to_the_thief));

        songs.add(new Song("Coldplay", "Yellow", R.drawable.coldplay, "Parachutes",
                R.drawable.coldplay_parachutes));
        songs.add(new Song("Coldplay", "Don't Panic", R.drawable.coldplay, "Parachutes",
                R.drawable.coldplay_parachutes));

        songs.add(new Song("Death Cab for Cutie", "The New Year", R.drawable.death_cab_for_cutie, "Transatlanticism",
                R.drawable.death_cab_for_cutie_transatlanticism));
        songs.add(new Song("Death Cab for Cutie", "Transatlanticism", R.drawable.death_cab_for_cutie, "Transatlanticism",
                R.drawable.death_cab_for_cutie_transatlanticism));
        songs.add(new Song("Death Cab for Cutie", "Tiny Vessels", R.drawable.death_cab_for_cutie, "Transatlanticism",
                R.drawable.death_cab_for_cutie_transatlanticism));

        songs.add(new Song("M.I.A.", "T10 Dollar", R.drawable.mia, "Arular",
                R.drawable.mia_arular));
        songs.add(new Song("M.I.A.", "URAQT", R.drawable.mia, "Arular",
                R.drawable.mia_arular));
        songs.add(new Song("M.I.A.", "Bucky Done Gun", R.drawable.mia, "Arular",
                R.drawable.mia_arular));

        songs.add(new Song("Usher", "U Got It Bad", R.drawable.usher));
        songs.add(new Song("Usher", "Call Me a Mack", R.drawable.usher));
        songs.add(new Song("Usher", "Can U Get wit It", R.drawable.usher));
        songs.add(new Song("Usher", "The Many Ways", R.drawable.usher));
        songs.add(new Song("Usher", "You Make Me Wanna...", R.drawable.usher));
        songs.add(new Song("Usher", "Nice & Slow", R.drawable.usher));
        songs.add(new Song("Usher", "My Way", R.drawable.usher));
        songs.add(new Song("Usher", "Bedtime", R.drawable.usher));
        songs.add(new Song("Usher", "Pop Ya Collar", R.drawable.usher));
        songs.add(new Song("Usher", "U Remind Me", R.drawable.usher));
        songs.add(new Song("Usher", "U Got It Bad", R.drawable.usher));
        songs.add(new Song("Usher", "U Don't Have to Call", R.drawable.usher));
        songs.add(new Song("Usher", "U-Turn", R.drawable.usher));

        songs.add(new Song("Rihanna", "SOS", R.drawable.rihanna));
        songs.add(new Song("Fergie", "London Bridge", R.drawable.fergie));
        songs.add(new Song("Justin Timberlake", "SexyBack", R.drawable.justin_timberlake));
        songs.add(new Song("Justin Timberlake", "What Goes Around... Comes Around", R.drawable.justin_timberlake));

        songs.add(new Song("Nelly Furtado", "Say It Right", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "I'm Like a Bird", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "Turn Off the Light", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "Hey, Man!", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "Powerless (Say What You Want)", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "Try", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "Força", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "Explode", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "The Grass Is Green", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "No Hay Igual", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "Maneater", R.drawable.nelly_furtado));
        songs.add(new Song("Nelly Furtado", "All Good Things (Come to an End)", R.drawable.nelly_furtado));

        songs.add(new Song("Maroon 5", "Makes Me Wonder", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "Harder to Breathe", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "This Love", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "She Will Be Loved", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "Sust Get Out", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "Wake Up Call", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "Won't Go Home Without You", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "Payphone", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "One More Night", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "Daylight", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "Love Somebody", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "Maps", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "Animals", R.drawable.maroon5));
        songs.add(new Song("Maroon 5", "Sugar", R.drawable.maroon5));

        return songs;
    }
}
