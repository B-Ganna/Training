package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListFill {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("four");
        System.out.println("Original list: " + li);
        Collections.fill(li, "TEMP_STRING");
        System.out.println("After fill: " + li);
    }
}
