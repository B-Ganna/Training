package go_it_ex.webinar9;


import java.util.Arrays;

public class BasicStringOperations {
    public static void main(String[] args) {
        final char[] charArrayToString = {'a', 'r', 'r', 'a', 'y'};

        final String stringToDisplay = Arrays.toString(charArrayToString)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "")
                .trim();

        System.out.println("\n" + stringToDisplay + "\n");

        //конкантенация
        String s1 = "first string";
        String s2 = " and second string";

        s1 += s2;
        System.out.println("Concat string example: " + s1);

        s1 = "1 ";
        s2 = "and 2";
        s1 = s1.concat(s2);
        System.out.println("Another concat string example: " + s1 + "\n");

        //сравнение строк
        String soldRoomName = "room";
        String newRoomName = "room";
        if (soldRoomName.equals(newRoomName)) {
            System.out.println("Names are equal");
        }

        String word1 = "ac";
        String word2 = "ab";
        System.out.println(word1.compareTo(word2) + "\n");

        //String Builder
        StringBuilder output = new StringBuilder();
        int count = 100;
        for (int i = 0; i < output.length(); i++)
            output.append("Some text");
        System.out.println(output);


    }
}
