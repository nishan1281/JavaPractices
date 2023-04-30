package org.example.Jukebox;

public class SongV3 {
    private String title;
    private String artist;
    private int bpm;

    public SongV3(String title, String artist, int bpm) {
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public boolean equals (Object asongs){
        SongV3 other = (SongV3)asongs;
        return title.equals(other.getTitle());
    }

    public int hashCode() {
        return title.hashCode();
    }

    public String getTitle() {
        return title;
    }

    public int getBpm() {
        return bpm;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return  "{"+title + "," +artist +"," + bpm +"}";
    }
}
