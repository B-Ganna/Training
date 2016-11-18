package go_it_ex.webinar10;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {
        try (
                final FileInputStream in = new FileInputStream("SongListMore.txt");
                final FileOutputStream out = new FileOutputStream("SomeFile.txt");) {
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

        }
    }
}
