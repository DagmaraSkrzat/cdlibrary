package pl.dominisz.cdlibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackBuilderTest {

    @Test
    void buildTrackTest() {
        String title = "title";
        int timeOfTrack = 100;   //czas bedziemy przechowywali w sekundach
        String artist = "Lemon";
        Genre genre = Genre.DISCO;

        Track track = new TrackBuilder()
                .setTitle(title)
                .setArtist(artist)
                .setTimeOfTrack(timeOfTrack)
                .setGenre(genre)
                .buildTrack();

        assertEquals(track.getTitle(), title);
        assertEquals(track.getArtist(), artist);
        assertEquals(track.getTimeOfTrack(), timeOfTrack);
        assertEquals(track.getGenre(), genre);

    }
}