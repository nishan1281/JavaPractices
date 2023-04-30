package org.example.Jukebox;

import java.util.Collections;
import java.util.List;

public class Jukebox1 {

    public static void main(String[] args) {
        Jukebox1.go();

    }

    public static void go(){
        List<String> songList = MockSongs.getSongString();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

}


