package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsAddAll {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("c");
        myList.add("c++");
        System.out.println("Initial list: " + myList);
        Collections.addAll(myList, "pearl", "php");
        System.out.println("After adding elements: " + myList);
        String[] strArr = {".Net", "Unix"};
        Collections.addAll(myList, strArr);
        System.out.println("After adding array: " + myList);
    }
}
