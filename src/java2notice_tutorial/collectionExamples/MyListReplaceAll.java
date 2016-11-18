package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListReplaceAll {
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

        //replace pearl with dum_dum
        Collections.replaceAll(list, "perl", "dum_dum");
        System.out.println(list);


    }
}
