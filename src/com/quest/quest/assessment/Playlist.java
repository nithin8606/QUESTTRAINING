package com.quest.quest.assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Playlist {
    private String name;
    private List<Track> tracks;

    public Playlist(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public void removeTrack(String trackName) {
        tracks.removeIf(track -> track.getName().equalsIgnoreCase(trackName));
    }

    public void sortByDuration() {
        tracks.sort(Comparator.comparingDouble(Track::getDuration));
    }

    public void shuffle() {
        Collections.shuffle(tracks);
    }

    public void toggleFavorite(String trackName) {
        for (Track track : tracks) {
            if (track.getName().equalsIgnoreCase(trackName)) {
                track.toggleFavorite();
                break;
            }
        }
    }

    @Override
    public String toString() {
        return name + " (" + tracks.size() + " tracks)";
    }
}

