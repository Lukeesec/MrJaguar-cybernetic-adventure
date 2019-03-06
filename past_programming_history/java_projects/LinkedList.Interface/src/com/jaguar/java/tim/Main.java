package com.jaguar.java.tim;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Rudy Mansco", "Deep blue");
        album.addSong("Love", 5.2);
        album.addSong("Coco", 2.2);
        album.addSong("Hoco", 1.2);
        album.addSong("Pco", 1.2);
        album.addSong("PBO", 5.23);
        album.addSong("For so god", 6.42);
        album.addSong("Dear God", 1.3);
        albums.add(album);
        /** From what I can tell.. We make a new album then after we've added songs to the album we add the album
         * to an arrayList.. NEED TO LEARN MORE ABOUT PASSING LISTS AND SUCH AS PARAMETERS
         */
        //Brand new Object created
        album = new Album("Lord is amazing", "Deep Red");
        album.addSong("Dance dance dance", 5.44);
        album.addSong("Thats the way I like it", 3.22);
        album.addSong("Everybody dance", 2.34);
        album.addSong("Strike body", 5.2);
        album.addSong("I want your love", 1.44);
        album.addSong("Love by rudy", 2.00);
        album.addSong("Hoco", 1.00);
        albums.add(album);

        List<Song> playList = new ArrayList<>();
        albums.get(1).addToPlayList("Hoco", playList);
        albums.get(0).addToPlayList("Dear God", playList);
        albums.get(1).addToPlayList("Body Strike", playList); //does not exist
        albums.get(0).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(1, playList);
        albums.get(1).addToPlaylist(3, playList);

        play(playList);

    }

    private static void play(List<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return; //dunno why we doin return
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playList");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list.");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.hasNext());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list.");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.hasPrevious());
                        }
                    }

                    break;

            }
        }
    }

    private static void printMenu() {
        //messy ik
        System.out.println("Available actions:\npress");
        System.out.println("0 - To quit\n1 - To go to the next song\n2 - " + "" +
                "To go to the previous song\n3 - To replay the current song" +
                "\n4 - " +
                "To list the songs\n5 - " +
                "To show menu\n6 - " +
                "To delete current song from playlist");
    }

    //All this does it iterates though all the song.. Rather then using a for loop or a for has loop
    private static void printList(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("==========================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==========================");
    }
}
