package com.jaguar.java;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {

    private String name;

    private static Album theAlbum = new Album("Default");
    private static Scanner scanner = new Scanner(System.in);

    public Playlist(String name) {
        this.name = name;
    }

    public void interfacePlaylist() {

        System.out.println("Starting playlist...");
        printActions();

        boolean quit = false;
        while (!quit) {
            int actions = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Press 6 to show actions");

            switch (actions) {
                case 0:
                    quit = true;
                    System.out.println("Shutting down playlist...");
                    break;

                case 1:
                    addAlbum();
                    break;

                case 2:
                    removeAlbum();
                    break;

                case 3:
                    addSong();
                    break;

                case 4:
                    System.out.println("Opening up playlist...");
                    play(theAlbum.getSongList());
                    break;

                case 5:
                    listAlbums();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private void play(LinkedList songs) {

        printSecondActions();

        boolean quit = false;
        boolean goingFoward = true;

        ListIterator<String> listIterator = songs.listIterator();
        if (songs.isEmpty()) {
            System.out.println("No songs in the playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next());
            printActions();
        }

        while (!quit) {
            int actions = scanner.nextInt();
            switch (actions) {
                case 0:
                    if (!goingFoward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingFoward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                        goingFoward = false;
                    }
                    break;

                case 1:
                    if (goingFoward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        } else {
                            goingFoward = false;
                        }
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingFoward = true;
                    }
                    break;

                case 2:
                    printSecondActions();
                    break;

                case 3:
                    System.out.println("Quiting playlist...");
                    quit = true;
                    break;

                case 4:
                    System.out.println("Switching back over to albums...");
                    interfacePlaylist();
                    quit = true;
            }
        }
    }

    private void printActions() {
        System.out.println("\tPlease create a album first then you can add songs to it.");
        System.out.println("0 - To shut down the playlist.\n1 - To add a new album.\n2 - To remove a existing album.\n" +
                "3 - To add a new song to an existing album.\n4 - To open up the playlist.\n5 - To list songs of a certain album.\n" +
                "6 - To show actions.");
    }

    private void printSecondActions() {
        System.out.println("\tPlease enter in the the action you want.");
        System.out.println("0 - To go to the next song.\n1 - To go to the previous song.\n2 - To show actions.\n" +
                "3 - To quit playlist.\n4 - To go back to album.");
    }

    private void addAlbum() {
        System.out.println("Please enter in a new album: ");
        String albumeName = scanner.nextLine().toLowerCase();
        theAlbum.addAlbum(albumeName);
    }

    private void removeAlbum() {
        System.out.println("Please enter in the album you want removed: ");
        String albumName = scanner.nextLine().toLowerCase();
        theAlbum.removeAlbum(albumName);
    }

    private void addSong() {
        System.out.println("Please enter in the album that you want this song to be in: ");
        String albumName = scanner.nextLine().toLowerCase();
        System.out.println("Please enter in the song name: ");
        String songName = scanner.nextLine().toLowerCase();
        theAlbum.addSongToAlbum(albumName, songName, 2.30);
    }

    private void listAlbums() {
        System.out.println("Please enter in the album: ");
        String name = scanner.nextLine().toLowerCase();
        theAlbum.listAlbums(name);
    }

    private String getName() {
        return name;
    }

}

