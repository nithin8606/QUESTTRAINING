package com.quest.quest.assessment;

import java.util.*;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<User> users = new ArrayList<>();

    public static void main(String[] args) {
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
                case 1:
                    createUser();
                    break;
                case 2:
                    fetchUserById();
                    break;
                case 3:
                    createPlaylist();
                    break;
                case 4:
                    addTrackToPlaylist();
                    break;
                case 5:
                    removeTrackFromPlaylist();
                    break;
                case 6:
                    sortPlaylistByDuration();
                    break;
                case 7:
                    shufflePlaylist();
                    break;
                case 8:
                    displayPlaylists();
                    break;
                case 9:
                    rateTrack();
                    break;
                case 10:
                    markUnmarkFavorite();
                    break;
                case 11:
                    displayFavoriteTracks();
                    break;
                case 12:
                    mergePlaylists();
                    break;
                case 13:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createUser() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        User user = new User(userId, userName);
        users.add(user);
        System.out.println("User created.");
    }

    private static void fetchUserById() {
        System.out.print("Enter user ID to fetch details: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("User not found.");
        }
    }

    private static void createPlaylist() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            System.out.print("Enter playlist name: ");
            String playlistName = scanner.nextLine();
            Playlist playlist = new Playlist(playlistName);
            user.addPlaylist(playlist);
            System.out.println("Playlist created.");
        } else {
            System.out.println("User not found.");
        }
    }

    private static void addTrackToPlaylist() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            System.out.print("Enter playlist name: ");
            String playlistName = scanner.nextLine();
            Playlist playlist = findPlaylist(user, playlistName);
            if (playlist != null) {
                System.out.print("Enter track name: ");
                String trackName = scanner.nextLine();
                System.out.print("Enter track duration (in minutes): ");
                double duration = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                Track track = new Track(trackName, duration);
                playlist.addTrack(track);
                System.out.println("Track added to playlist.");
            } else {
                System.out.println("Playlist not found.");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static void removeTrackFromPlaylist() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            System.out.print("Enter playlist name: ");
            String playlistName = scanner.nextLine();
            Playlist playlist = findPlaylist(user, playlistName);
            if (playlist != null) {
                System.out.print("Enter track name to remove: ");
                String trackName = scanner.nextLine();
                playlist.removeTrack(trackName);
                System.out.println("Track removed from playlist.");
            } else {
                System.out.println("Playlist not found.");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static void sortPlaylistByDuration() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            System.out.print("Enter playlist name: ");
            String playlistName = scanner.nextLine();
            Playlist playlist = findPlaylist(user, playlistName);
            if (playlist != null) {
                playlist.sortByDuration();
                System.out.println("Playlist sorted by duration.");
            } else {
                System.out.println("Playlist not found.");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static void shufflePlaylist() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            System.out.print("Enter playlist name: ");
            String playlistName = scanner.nextLine();
            Playlist playlist = findPlaylist(user, playlistName);
            if (playlist != null) {
                playlist.shuffle();
                System.out.println("Playlist shuffled.");
            } else {
                System.out.println("Playlist not found.");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static void displayPlaylists() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            for (Playlist playlist : user.getPlaylists()) {
                System.out.println(playlist);
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static void rateTrack() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            System.out.print("Enter playlist name: ");
            String playlistName = scanner.nextLine();
            Playlist playlist = findPlaylist(user, playlistName);
            if (playlist != null) {
                System.out.print("Enter track name: ");
                String trackName = scanner.nextLine();
                Track track = findTrack(playlist, trackName);
                if (track != null) {
                    System.out.print("Enter rating (1 to 5): ");
                    double rating = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    track.setRating(rating);
                    System.out.println("Track rated.");
                } else {
                    System.out.println("Track not found.");
                }
            } else {
                System.out.println("Playlist not found.");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static void markUnmarkFavorite() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            System.out.print("Enter playlist name: ");
            String playlistName = scanner.nextLine();
            Playlist playlist = findPlaylist(user, playlistName);
            if (playlist != null) {
                System.out.print("Enter track name: ");
                String trackName = scanner.nextLine();
                playlist.toggleFavorite(trackName);
                System.out.println("Track marked/unmarked as favorite.");
            } else {
                System.out.println("Playlist not found.");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static void displayFavoriteTracks() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            for (Track track : user.getFavoriteTracks()) {
                System.out.println(track);
            }
        } else {
            System.out.println("User not found.");
        }
    }

    private static void mergePlaylists() {
        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        User user = findUserById(userId);
        if (user != null) {
            System.out.print("Enter first playlist name: ");
            String playlistName1 = scanner.nextLine();
            Playlist playlist1 = findPlaylist(user, playlistName1);
            if (playlist1 != null) {
                System.out.print("Enter second playlist name: ");
                String playlistName2 = scanner.nextLine();
                Playlist playlist2 = findPlaylist(user, playlistName2);
                if (playlist2 != null) {
                    playlist1.getTracks().addAll(playlist2.getTracks());
                    System.out.println("Playlists merged.");
                } else {
                    System.out.println("Second playlist not found.");
                }
            } else {
                System.out.println("First playlist not found.");
            }
        } else {
            System.out.println("User not found.");
        }
    }

    // Utility Methods
    private static User findUserById(String userId) {
        for (User user : users) {
            if (user.getId().equalsIgnoreCase(userId)) {
                return user;
            }
        }
        return null;
    }

    private static Playlist findPlaylist(User user, String playlistName) {
        for (Playlist playlist : user.getPlaylists()) {
            if (playlist.getName().equalsIgnoreCase(playlistName)) {
                return playlist;
            }
        }
        return null;
    }

    private static Track findTrack(Playlist playlist, String trackName) {
        for (Track track : playlist.getTracks()) {
            if (track.getName().equalsIgnoreCase(trackName)) {
                return track;
            }
        }
        return null;
    }

}