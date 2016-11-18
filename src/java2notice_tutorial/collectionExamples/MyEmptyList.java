package java2notice_tutorial.collectionExamples;


import java.util.Collections;
import java.util.List;

public class MyEmptyList {
    public static void main(String[] args) {
        List<String> myEmptyList = Collections.<String>emptyList();
        System.out.println("My empty list: " + myEmptyList);
    }
}
