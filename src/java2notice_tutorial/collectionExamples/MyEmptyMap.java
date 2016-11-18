package java2notice_tutorial.collectionExamples;


import java.util.Collections;
import java.util.Map;

public class MyEmptyMap {
    public static void main(String[] args) {
        Map<String, String> myEmptyMap = Collections.<String, String>emptyMap();
        System.out.println("My empty map is: " + myEmptyMap);
    }

}
