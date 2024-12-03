package com.quest.quest.assessment;

import java.util.*;

public class User {
    private String id;
    private String name;
    private List<Playlist> playlists;
    private List<Track> favoriteTracks;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.playlists = new ArrayList<>();
        this.favoriteTracks = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public List<Track> getFavoriteTracks() {
        return favoriteTracks;
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void addFavoriteTrack(Track track) {
        favoriteTracks.add(track);
    }

    @Override
    public String toString() {
        return "User ID: " + id + "\nName: " + name + "\nPlaylists: " + playlists.size() + " Playlist(s)\nFavorite Tracks: " + favoriteTracks.size() + " Track(s)";
    }

    public void removeFavoriteTrack(Track track) {
        favoriteTracks.remove(track);
    }
}

