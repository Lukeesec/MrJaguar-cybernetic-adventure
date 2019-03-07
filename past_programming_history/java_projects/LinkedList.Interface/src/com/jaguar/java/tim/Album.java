package com.jaguar.java.tim;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    /**
     * Creates a variable checkedSong for every entry thats in the arrayList
     * vs's a normal forloop.. (For each statement)
     */
    private Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong; //returns the actual song
            }
        }
        return null;
    }

    /**
     * We are passing the actual track number we want to add.. Songs have track numbers
     * so thats why we can do it like this..
     */
    public boolean addToPlaylist(int trackNumber, List<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    /**
     * Making a overloaded addToPlayList so we can also use the title of the song instead
     * of just the track number.. Also the method is overloaded to make life easier and so we dont need
     * to name two different methods.. theres a few other reasons that I dont know
     */
    public boolean addToPlayList(String title, List<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This song; " + title + " is not in this album");
        return false;
    }


}
