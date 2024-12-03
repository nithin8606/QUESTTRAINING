package com.quest.quest.assessment;

import java.util.Scanner;

public class Main implements OperationInterface {
    private User user;
    private Playlist currentPlaylist;
    private Scanner scanner;

    public Main() {
        user = new User("1", "Nithin");
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main mainApp = new Main();
        mainApp.run();
    }

    public void run() {
        while (true) {
            System.out.println("\nPlaylist App Menu:");
            System.out.println("1. Create User");
            System.out.println("2. Fetch User Details");
            System.out.println("3. Create Playlist");
            System.out.println("4. Add Track to Playlist");
            System.out.println("5. Remove Track from Playlist");
            System.out.println("6. Sort Playlist by Duration");
            System.out.println("7. Shuffle Playlist");
            System.out.println("8. Display Playlists");
            System.out.println("9. Rate Track");
            System.out.println("10. Mark/Unmark Track as Favorite");
            System.out.println("11. Display Favorite Tracks");
            System.out.println("12. Merge Playlists");
            System.out.println("13. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> createUser();
                case 2 -> fetchUserDetails();
                case 3 -> createPlaylist();
                case 4 -> addTrackToPlaylist();
                case 5 -> removeTrackFromPlaylist();
                case 6 -> sortPlaylistByDuration();
                case 7 -> shufflePlaylist();
                case 8 -> displayPlaylists();
                case 9 -> rateTrack();
                case 10 -> markOrUnmarkFavorite();
                case 11 -> displayFavoriteTracks();
                case 12 -> mergePlaylists();
                case 13 -> {
                    System.out.println("Exiting the Playlist App.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    @Override
    public void createUser() {
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter User Name: ");
        String userName = scanner.nextLine();
        user = new User(userId, userName);
        System.out.println("User created successfully.");
    }

    @Override
    public void fetchUserDetails() {
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("No user found. Please create a user first.");
        }
    }

    @Override
    public void createPlaylist() {
        System.out.print("Enter Playlist Name: ");
        String playlistName = scanner.nextLine();
        currentPlaylist = new Playlist(playlistName);
        user.addPlaylist(currentPlaylist);
        System.out.println("Playlist created successfully.");
    }

    @Override
    public void addTrackToPlaylist() {
        if (currentPlaylist != null) {
            System.out.print("Enter Track Name: ");
            String trackName = scanner.nextLine();
            System.out.print("Enter Track Duration: ");
            double trackDuration = scanner.nextDouble();
            scanner.nextLine();

            Track track = new Track(trackName, trackDuration);
            currentPlaylist.addTrack(track);
            System.out.println("Track added to playlist.");
        } else {
            System.out.println("No playlist found. Please create a playlist first.");
        }
    }

    @Override
    public void removeTrackFromPlaylist() {
        if (currentPlaylist != null) {
            System.out.print("Enter Track Name to remove: ");
            String trackNameToRemove = scanner.nextLine();
            currentPlaylist.removeTrack(trackNameToRemove);
            System.out.println("Track removed from playlist.");
        } else {
            System.out.println("No playlist found. Please create a playlist first.");
        }
    }

    @Override
    public void sortPlaylistByDuration() {
        if (currentPlaylist != null) {
            currentPlaylist.sortByDuration();
            System.out.println("Playlist sorted by duration.");
        } else {
            System.out.println("No playlist found. Please create a playlist first.");
        }
    }

    @Override
    public void shufflePlaylist() {
        if (currentPlaylist != null) {
            currentPlaylist.shuffle();
            System.out.println("Playlist shuffled.");
        } else {
            System.out.println("No playlist found. Please create a playlist first.");
        }
    }

    @Override
    public void displayPlaylists() {
        if (user != null) {
            for (Playlist playlist : user.getPlaylists()) {
                System.out.println("\n" + playlist.getName() + " (Playlist):");
                for (Track track : playlist.getTracks()) {
                    System.out.println("\t" + track);
                }
            }
        } else {
            System.out.println("No user found. Please create a user first.");
        }
    }

    @Override
    public void rateTrack() {
        if (currentPlaylist != null) {
            System.out.print("Enter Track Name to rate: ");
            String trackNameToRate = scanner.nextLine();
            Track track = currentPlaylist.getTrackByName(trackNameToRate);

            if (track != null) {
                System.out.print("Enter Rating (0 to 5): ");
                double rating = scanner.nextDouble();
                track.setRating(rating);
                System.out.println("Track rated.");
            } else {
                System.out.println("Track not found in this playlist.");
            }
        } else {
            System.out.println("No playlist found. Please create a playlist first.");
        }
    }

    @Override
    public void markOrUnmarkFavorite() {
        if (currentPlaylist != null) {
            System.out.print("Enter Track Name to mark/unmark as favorite: ");
            String trackNameToFav = scanner.nextLine();
            Track track = currentPlaylist.getTrackByName(trackNameToFav);

            if (track != null) {
                track.toggleFavorite();
                if (track.isFavorite()) {
                    user.addFavoriteTrack(track);
                    System.out.println("Track marked as favorite.");
                } else {
                    user.removeFavoriteTrack(track);
                    System.out.println("Track unmarked as favorite.");
                }
            } else {
                System.out.println("Track not found in this playlist.");
            }
        } else {
            System.out.println("No playlist found. Please create a playlist first.");
        }
    }

    @Override
    public void displayFavoriteTracks() {
        if (user != null) {
            System.out.println("Favorite Tracks:");
            for (Track favoriteTrack : user.getFavoriteTracks()) {
                System.out.println("\t" + favoriteTrack);
            }
        } else {
            System.out.println("No user found. Please create a user first.");
        }
    }

    @Override
    public void mergePlaylists() {
        if (user != null) {
            System.out.print("Enter First Playlist Name to merge: ");
            String firstPlaylistName = scanner.nextLine();
            Playlist firstPlaylist = findPlaylistByName(firstPlaylistName);

            System.out.print("Enter Second Playlist Name to merge: ");
            String secondPlaylistName = scanner.nextLine();
            Playlist secondPlaylist = findPlaylistByName(secondPlaylistName);

            if (firstPlaylist != null && secondPlaylist != null) {
                for (Track track : secondPlaylist.getTracks()) {
                    firstPlaylist.addTrack(track);
                }
                System.out.println("Playlists merged successfully.");
            } else {
                System.out.println("One or both playlists not found.");
            }
        } else {
            System.out.println("No user found. Please create a user first.");
        }
    }

    private Playlist findPlaylistByName(String playlistName) {
        for (Playlist playlist : user.getPlaylists()) {
            if (playlist.getName().equalsIgnoreCase(playlistName)) {
                return playlist;
            }
        }
        return null;
    }
}
