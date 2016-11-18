package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListRotate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("unix");
        list.add("perl");
        list.add("php");
        list.add("javascript");
        list.add("ruby");
        list.add(".net");
        list.add("perl");
        list.add("c++");
        System.out.println(list);
        Collections.rotate(list, 3);
        System.out.println("List after rotation: ");
        System.out.println(list);
    }
}
