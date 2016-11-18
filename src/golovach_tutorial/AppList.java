package golovach_tutorial;


import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class AppList {
    public static void main(String[] args) {
        Collection<String> A = new HashSet<>(Arrays.asList("1", "2", "3"));
        Collection<String> B = new HashSet<>(Arrays.asList("x", "y", "z"));
        A.removeAll(B);
        A.addAll(B);
    }
}
