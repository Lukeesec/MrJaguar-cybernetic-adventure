package com.jaguar.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private LinkedList<Song> songList;
    private ArrayList<Album> albumList;
    private static Song song = new Song("default", 0.0);

    public Album(String name) {
        this.name = name;
        this.songList = new LinkedList<Song>();
        this.albumList = new ArrayList<Album>();
    }

    public boolean addSongToAlbum(String albumName, String title, double duration) {
        Album album = findAlbum(albumName);
        if (album != null) {
            return album.newSong(title, duration);
        }
        return false;
    }


    public boolean newSong(String newTitle, double newDuration) {
        if (findSong(newTitle) == null) {
            this.songList.add((new Song(newTitle, newDuration)));
            System.out.println("Song: " + song.getTitle() + " added.");
            return true;
        }
        System.out.println("Song: " + song.getTitle() + " is already on file.");
        return false;
    }


    public boolean addAlbum(String albumName) {
        if (findAlbum(albumName) == null) {
            this.albumList.add(new Album(albumName));
            System.out.println("Album: " + albumName + " added.");
            return true;
        } else {
            System.out.println("Album: " + albumName + " is already on file.");
            return false;
        }
    }

    public boolean removeAlbum(String albumName) {
        if (findAlbum(albumName) != null) {
            int position = searchForAlbum(albumName);
            //   if (position >= 0) {

            listAlbums(albumName); //just a test to make sure everything is working
            this.albumList.remove(position);

            System.out.println("Album: " + albumName + " removed.");
            return true;
            //  }
        }
        System.out.println("Album: " + albumName + " is not on file.");
        return false;
    }

    private int searchForAlbum(String album) {
        return albumList.indexOf(album);
    }

    private Song findSong(String title) {
        for (int i = 0; i < this.songList.size(); i++) {
            Song checkedSong = this.songList.get(i);
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    private Album findAlbum(String albumName) {
        for (int i = 0; i < this.albumList.size(); i++) {
            Album checkedAlbum = this.albumList.get(i);
            if (checkedAlbum.getName().equals(albumName)) {
                return checkedAlbum;
            }
        }
        return null;
    }

    public boolean listAlbums(String albumName) {
        Album theAlbum = findAlbum(albumName);
        if (theAlbum != null) {
            System.out.println("Album songs for " + theAlbum.getName()); //getting printed

            LinkedList<Song> albumSongs = theAlbum.getSongList(); //album isnt carrying over songs for some reason
            for (int i = 0; i < albumSongs.size(); i++) {
                Song albumSong = albumSongs.get(i);
                System.out.println("Song:[" + (1 + i) + "] " + albumSong.getTitle() + " Duration: "
                        + albumSong.getDuration() + "m"); //not getting printed
            }
            return true;
        } else {
            System.out.println("Album: " + albumName + " not on file.");
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public LinkedList<Song> getSongList() {
        return songList;
    }
}
