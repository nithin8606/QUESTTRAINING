package com.quest.quest.assessment;

import java.util.List;

public interface PlaylistAction {
    void createUser(String userId, String userName);
    User fetchUserById(String userId);
    void createPlaylist(String userId, String playlistName);
    void addTrackToPlaylist(String userId, String playlistName, String trackName, double duration);
    void removeTrackFromPlaylist(String userId, String playlistName, String trackName);
    void sortPlaylistByDuration(String userId, String playlistName);
    void shufflePlaylist(String userId, String playlistName);
    List<Playlist> getPlaylists(String userId);
    void rateTrack(String userId, String playlistName, String trackName, double rating);
    void markUnmarkFavorite(String userId, String playlistName, String trackName);
    List<Track> getFavoriteTracks(String userId);
    void mergePlaylists(String userId, String playlistName1, String playlistName2);
}

