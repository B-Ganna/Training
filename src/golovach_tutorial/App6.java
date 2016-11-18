package golovach_tutorial;

import java.util.*;

public class App6 {
    public static void main(String[] args) {
        // TODO: как быстро убрать дубликаты:

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 200, 2, 3, 1, 0));
        System.out.println(new HashSet<>(list));
        System.out.println(new TreeSet<Integer>());

    }
}
