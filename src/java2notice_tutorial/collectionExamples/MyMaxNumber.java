package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMaxNumber {
    public static void main(String[] args) {
        List<Integer>li = new ArrayList<>();
        li.add(23);
        li.add(44);
        li.add(12);
        li.add(45);
        li.add(2);
        li.add(16);
        System.out.println("Maximum element is: "+ Collections.max(li));
    }
}
