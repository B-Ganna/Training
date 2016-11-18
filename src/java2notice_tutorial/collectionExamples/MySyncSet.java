package java2notice_tutorial.collectionExamples;


import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MySyncSet {
    public static void main(String[] args) {
        Set<String> ss = new HashSet<>();
        Set<String> sysSet = Collections.synchronizedSet(ss);
        System.out.println("Synchronized set got created...");
    }
}
