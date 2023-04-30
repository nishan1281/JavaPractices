package org.example.Jukebox;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Jukebox8 {
    public static void main(String[] args) {
        Jukebox8.go();
    }
    public static void go(){
        List<SongV3> songV3List = MockSongs.getSongV3();
        System.out.println("\n Without Sorting: \n" + songV3List);

        //sorting by lambdas based on title
        songV3List.sort((a, b)-> a.getTitle().compareTo(b.getTitle()));
        System.out.println("\n Sorting by title: \n" + songV3List);

        //using Set
//        Set<SongV3> songV3Set = new HashSet<>(songV3List);
//        System.out.println("\n by set: \n" + songV3Set);

        //using TreeSet
        Set<SongV3> songV3SetTreeSet = new TreeSet<>((a, b)-> a.getBpm() - b.getBpm());
        songV3SetTreeSet.addAll(songV3List);
        System.out.println("\n by Tree set: \n" + songV3SetTreeSet);
    }

}
