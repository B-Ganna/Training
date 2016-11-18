package example_collections;

import java.util.*;


public class Test001 {
    public static void main(String[] args) {
        //App3<String> list = new LinkedHashSet<>();
        Set<String> list = new HashSet<>();
        //App3<String> list = new TreeSet<>();

        System.out.println(list.add("c"));
        System.out.println(list.add("b"));
        System.out.println(list.add("a"));

        System.out.println(list);
    }
}
