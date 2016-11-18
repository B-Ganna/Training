package head_first_in_java.exceptions;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class JunkeBox {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new JunkeBox().go();

    }

    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one, Song two) {
        return one.getArtist().compareTo(two.getArtist());
        }

    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        HashSet<Song>songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet);

    }

    void getSongs() {
        try {
            File file = new File("Macintosh HD://Users//annabredun//Documents//SongListMore.pages");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
        songList.add(nextSong);
    }
}
