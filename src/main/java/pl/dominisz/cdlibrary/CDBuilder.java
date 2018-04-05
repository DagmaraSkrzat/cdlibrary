package pl.dominisz.cdlibrary;

import java.util.ArrayList;
import java.util.List;

public class CDBuilder {

    private String title;
    private String artist;
    private int releaseYear;
    private String producer;
    private List<Track> trackList;
    private Genre genre;
    private boolean original;
    private int amountOfCDs;

    public CDBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public CDBuilder setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public CDBuilder setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        return this;
    }

    public CDBuilder setProducer(String producer) {
        this.producer = producer;
        return this;
    }

    public CDBuilder setTrack (Track track){
        if(trackList == null) {
            this.trackList =  new ArrayList<>();
        }
        trackList.add(track);
        return this;
    }

    public CDBuilder setTrackList(List<Track> trackList) {
        this.trackList = trackList;
        return this;
    }

    public CDBuilder setGenre(Genre genre) {
        this.genre = genre;
        return this;
    }

    public CDBuilder setOriginal(boolean original) {
        this.original = original;
        return this;
    }

    public CDBuilder setAmountOfCDs(int amountOfCDs) {
        this.amountOfCDs = amountOfCDs;
        return this;
    }

    public CD buildCD() {
        return new CD(title, artist, releaseYear, producer, trackList, genre, original, amountOfCDs);
    }


}
