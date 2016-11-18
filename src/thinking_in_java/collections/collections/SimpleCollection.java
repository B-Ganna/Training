package thinking_in_java.collections.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> c = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            c.add(i);
        }
        for (Integer i : c) {
            System.out.print(i + ",");
        }
    }
}
