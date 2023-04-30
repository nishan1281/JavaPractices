package org.example.Jukebox;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jukebox2 {
    public static void main(String[] args) {
        Jukebox2.go();
    }

    public static void go(){
        List<SongV2> songV2List = MockSongs.getSongV2();
        System.out.println("\n Unsorted songs:");
        System.out.println(songV2List);

        Collections.sort(songV2List);
        System.out.println("\n Sorted songs based on comparable:");
        System.out.println(songV2List);

        //to compare based on artist
        //1st make an instance of a Comparator Class.
        //2nd invoke sort method on the list by passing the instance.
        ArtistCompare artistCompare = new ArtistCompare();
        songV2List.sort(artistCompare);
        System.out.println("\n Sorted songs based on comparator:");
        System.out.println(songV2List);

        //Sorting without a separate class
        songV2List.sort(new Comparator<SongV2>() {
            @Override
            public int compare(SongV2 one, SongV2 two) {
                return one.getTitle().compareTo(two.getTitle());
            }
        });
        System.out.println("\n Sorted songs based on comparable with inner class:");
        System.out.println(songV2List);

        //SORTING USING LAMBDA. No different class no anything just one line code...
        songV2List.sort((one, two)-> one.getArtist().compareTo(two.getArtist()));
        System.out.println("\n Sorted songs based on Lambda:");
        System.out.println(songV2List);
    }
 }
