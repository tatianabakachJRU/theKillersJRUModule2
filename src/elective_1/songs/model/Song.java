package elective_1.songs.model;

import java.util.Objects;

public class Song {
private final String title;
private final String artist;
private final String genre;
private final int year;
private final int timesPlayed;

    public Song(String title, String artist, String genre, int year, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timesPlayed;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;
        return year == song.year &&
                timesPlayed == song.timesPlayed &&
                Objects.equals(title, song.title) &&
                artist.equals(song.artist) &&
                Objects.equals(genre, song.genre);
    }

    @Override
    public int hashCode() {
//        int result = Objects.hashCode(title);
//        result = 31 * result + Objects.hashCode(artist);
//        result = 31 * result + Objects.hashCode(genre);
//        result = 31 * result + year;
//        result = 31 * result + timesPlayed;
//        return result;
        return Objects.hash(title, artist, genre, year, timesPlayed);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                ", timesPlayed=" + timesPlayed +
                '}';
    }

    // Practice for you! Create a constructor, all the getters and a toString()
}