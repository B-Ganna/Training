package example_collections;


import java.util.ArrayList;
import java.util.Collection;

public class Test00 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);
        System.out.println(list.contains("x"));
        System.out.println(list.contains("a"));

        System.out.println(list.remove("xxx"));
        System.out.println(list.remove("a"));

        System.out.println(list);

    }

}

