package pl.dominisz.cdlibrary;

public class TrackBuilder {

    private String title;
    private int timeOfTrack;   //czas bedziemy przechowywali w sekundach
    private String artist;
    private Genre genre;

    public TrackBuilder() {
    }

    public TrackBuilder setTitle(String title){
        this.title = title;
        return this;
    }
    public TrackBuilder setTimeOfTrack(int timeOfTrack){
        this.timeOfTrack = timeOfTrack;
        return this;
    }
    public TrackBuilder setArtist(String artist){
        this.artist = artist;
        return this;
    }
    public TrackBuilder setGenre(Genre genre){
        this.genre = genre;
        return this;
    }

    public Track buildTrack() {
        return new Track(title, timeOfTrack, artist, genre);
    }
}
