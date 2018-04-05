package pl.dominisz.cdlibrary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CDTest {

    @Test
    void getTotalTimeTest() {

        Track track1 = new TrackBuilder()
                .setTimeOfTrack(100)
                .buildTrack();
        Track track2 = new TrackBuilder()
                .setTimeOfTrack(99)
                .buildTrack();
        Track track3 = new TrackBuilder()
                .setTimeOfTrack(110)
                .buildTrack();

        CD cd = new CDBuilder()
                .setTitle("cd title")
                .setTrack(track1)
                .setTrack(track2)
                .setTrack(track3)
                .buildCD();

        assertEquals(309, cd.getTotalTime());

    }
}
