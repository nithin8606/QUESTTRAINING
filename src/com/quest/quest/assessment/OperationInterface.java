package com.quest.quest.assessment;

public interface OperationInterface {
    void createUser();
    void fetchUserDetails();
    void createPlaylist();
    void addTrackToPlaylist();
    void removeTrackFromPlaylist();
    void sortPlaylistByDuration();
    void shufflePlaylist();
    void displayPlaylists();
    void rateTrack();
    void markOrUnmarkFavorite();
    void displayFavoriteTracks();
    void mergePlaylists();
}
