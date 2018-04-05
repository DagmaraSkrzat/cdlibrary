package pl.dominisz.cdlibrary;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalTime;

@Getter
@AllArgsConstructor
public class Track {

    private String title;
    private int timeOfTrack;   //czas bedziemy przechowywali w sekundach
    private String artist;
    private Genre genre;

}
