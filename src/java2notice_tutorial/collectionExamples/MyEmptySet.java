package java2notice_tutorial.collectionExamples;


import java.util.Collections;
import java.util.Set;

public class MyEmptySet {
    public static void main(String[] args) {
        Set<String> myEmptySet = Collections.<String>emptySet();
        System.out.println("My empty set: " + myEmptySet);
    }

}
