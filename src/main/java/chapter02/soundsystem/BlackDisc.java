package chapter02.soundsystem;

import java.util.List;

public class BlackDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlackDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public BlackDisc() {
    }

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
        for (String track : tracks) {
            System.out.println("track " + track);
        }
    }
}
