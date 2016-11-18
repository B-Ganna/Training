package head_first_in_java.exceptions;


public class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bmp;

    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bmp = b;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBmp() {
        return bmp;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Song o) {
        return title.compareTo(getTitle());
    }
}
