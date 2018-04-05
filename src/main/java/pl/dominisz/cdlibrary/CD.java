package pl.dominisz.cdlibrary;

import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.List;

@Getter
@AllArgsConstructor
public class CD {

    private String title;
    private String artist;
    private int releaseYear;
    private String producer;
    private List<Track> trackList;
    private Genre genre;
    private boolean original;
    private int amoutOfCDs;

    public int getTotalTime() {
        int totalTime = 0;

        totalTime = (int) trackList.stream()
                .mapToInt(track -> track.getTimeOfTrack())
                .sum();

//      PONIŻSZA PĘTLA ZASTĄPIONA POWYŻSZYM STREAM'EM
//        for (int i = 0; i< trackList.size(); i++) {
//            totalTime += trackList.get(i).getTimeOfTrack();
//        }

        return totalTime;
    }

}
