package org.example.Jukebox;

import java.util.ArrayList;
import java.util.List;

//this class does not have any instance fields
public class MockSongs {

    //Static method creation as no instances filed in the class
    public static List<String> getSongString (){

        // return interface type List and hide the implementation of ArrayList
        List<String> songs = new ArrayList<String>();
        songs.add("somersault");
        songs.add("cassidy");
        songs.add("$10");
        songs.add("Cassidy");
        songs.add("havana");
        songs.add("50 ways");

        return songs;
    }

    public static List<SongV2> getSongV2 (){
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("somersault", "zero 7", 147));
        songs.add(new SongV2("cassidy", "grateful dead", 158));
        songs.add(new SongV2("$10", "hitchhiker", 140));
        songs.add(new SongV2("havana", "cabello", 105));
        songs.add(new SongV2("Cassidy", "grateful dead", 158));
        songs.add(new SongV2("50 ways", "simon", 102));
        songs.add(new SongV2("$10", "hitchhiker", 140));
        return songs;
    }

    public static List<SongV3> getSongV3 (){
        List<SongV3> songs = new ArrayList<>();
        songs.add(new SongV3("somersault", "zero 7", 147));
        songs.add(new SongV3("cassidy", "grateful dead", 158));
        songs.add(new SongV3("$10", "hitchhiker", 140));
        songs.add(new SongV3("havana", "cabello", 105));
        songs.add(new SongV3("$10", "hitchhiker", 140));
        songs.add(new SongV3("Cassidy", "grateful dead", 158));
        songs.add(new SongV3("50 ways", "simon", 102));
        return songs;
    }




}
