package pl.dominisz.cdlibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * http://dominisz.pl
 * 05.04.2018
 */
public class CDBuilderTest {

    @Test
    void testCDBuilder() {
        Track track1 = new TrackBuilder()
                .setTitle("title1")
                .buildTrack();
        Track track2 = new TrackBuilder()
                .setTitle("title2")
                .buildTrack();
        Track track3 = new TrackBuilder()
                .setTitle("title3")
                .buildTrack();
        CD cd = new CDBuilder()
                .setTitle("cd title")
                .setTrack(track1)
                .setTrack(track2)
                .setTrack(track3)
                .buildCD();
        assertEquals("cd title", cd.getTitle());
        assertEquals(3, cd.getTrackList().size());
        assertEquals("title1", cd.getTrackList().get(0));
        assertEquals("title2", cd.getTrackList().get(1));
        assertEquals("title3", cd.getTrackList().get(2));
    }
}