package go_it_ex.webinar10;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScanXan {
    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("SongListMore.txt")));) {
            while (scanner.hasNext()) {
                System.out.println(scanner.next());

            }
        }
    }
}
        /*Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader("SongListMore.txt")));
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }*/
