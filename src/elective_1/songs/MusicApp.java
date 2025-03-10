package elective_1.songs;

import elective_1.songs.data.Songs;
import elective_1.songs.model.Song;

import java.util.*;
import java.util.stream.Collectors;

public class MusicApp {
    public static void main(String[] args) {
        Songs songs = new Songs();
        Scanner scanner = new Scanner(System.in);
        List<Song> listSongs = songs.getSongs();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("1. Filter rock songs");
            System.out.println("2. Get list of genres");
            System.out.println("3. Show duplicates");
            System.out.println("4. Show the most popular song");
            System.out.println("5. Show the least popular song");
            System.out.println("0. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    filterSongs(listSongs);
                    break;
                case 2:
                    getListGenre(listSongs);
                    break;
                case 3:
                    getDuplicates(listSongs);
                    break;
                case 4:
                    getMostPopularSong(listSongs);
                    break;
                case 5:
                    Song unpopularSong = listSongs.stream()
                            .min(Comparator.comparingInt(Song::getTimesPlayed))
                            .orElse(null);
                    System.out.println("The least popular song: " + unpopularSong);
                    break;
                case 0:
                    System.out.println("Exit program!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid input. Try again!");
            }
        }
    }

    private static void getMostPopularSong(List<Song> listSongs) {
        Song popularSong = listSongs.stream()
                .max(Comparator.comparingInt(Song::getTimesPlayed))
                .orElse(null);
        System.out.println("The most popular song: " + popularSong);
        return;
    }

    private static void getDuplicates(List<Song> listSongs) {
        Set<Song> uniqueSongs = new HashSet<>();
        List<Song> duplicateSongs = new ArrayList<>();

        for (Song song : listSongs) {
            if (!uniqueSongs.add(song)) {
                duplicateSongs.add(song);
            }
        }
        System.out.println("Duplicates: ");
        duplicateSongs.forEach(System.out::println);
        return;
    }

    private static void getListGenre(List<Song> listSongs) {
        Set<String> setGenres = listSongs.stream()
                .map(Song::getGenre)
                .collect(Collectors.toSet());
        System.out.println("List genres:");
        setGenres.forEach(System.out::println);
    }

    private static void filterSongs(List<Song> listSongs) {
        List<Song> rockSongs = listSongs
                .stream()
                .filter((song) -> song.getGenre()
                        .equalsIgnoreCase("Rock"))
                .toList();
        System.out.println("Rock songs:");
        rockSongs.forEach(System.out::println);
    }
}
