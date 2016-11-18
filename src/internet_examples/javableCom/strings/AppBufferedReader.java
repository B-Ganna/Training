package internet_examples.javableCom.strings;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AppBufferedReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Your name?");
        String name = br.readLine();
        System.out.println("Your surname?");
        String surname = br.readLine();
        System.out.println(name + " " + surname);

        String name2 = br.readLine();
        System.out.println(name + " " + br.readLine());

        Scanner sc = new Scanner(System.in);
        System.out.println("Your name?");
        String s = sc.next();
        System.out.println("Your surname?");
        String s2 = sc.next();
        System.out.println(s + " " + s2);

    }
}
