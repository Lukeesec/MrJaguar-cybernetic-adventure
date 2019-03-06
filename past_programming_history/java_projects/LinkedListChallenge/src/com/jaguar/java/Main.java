package com.jaguar.java;

public class Main {


    /** UNFINSHED.. TAKING WAY THE HECK TO LONG
     *
     */
    private static Playlist playlist = new Playlist("Playlist default");

    public static void main(String[] args) {

        playlist.interfacePlaylist();

    }
}

/**
 * We need to be able to store songs in an album.. So if we want to add a new song we need to
 * make sure the album is there first then if it is add the new song.
 * <p>
 * Playlist for songs. album class containing songs. song from different albums
 * can be added to the playlist.
 * <p>
 * PlayList will hold the methods to next/previous/quit/replay (and list the songs)
 * <p>
 * The PlayList will be a separate class.. That will hold songs.. and an album will hold an playlist that holds songs
 * <p>
 * So an album holds songs.. and the playlist class can pull from a certain album then pull whatever song is
 * in that album.. and the playlist class can do that as many times as wanted..
 */
// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList

// Songs from different albums can be added to the playlist and will appear in the list in the order CHECK OUT
// they are added.

// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist

// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).

// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.

// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remov

//        Album album = new Album("Album default");
//        Playlist playlist = new Playlist("Playlist default");
//        playlist.addAlbum();

//  album.addAlbum("CaptanJaguar");
//        album.addSongToAlbum("CaptanJaguar","Rudy Mansco",2.20);
//        album.addSongToAlbum("CaptanJaguar","Love by Rudy Mansco",1.50);
//        album.listAlbums("CaptanJaguar");
//        System.out.println("----------------------------------------");
//        album.addAlbum("CaptanJosh");
//        album.addSongToAlbum("CaptanJosh","Rudy",2.20);
//  album.listAlbums("CaptanJosh");