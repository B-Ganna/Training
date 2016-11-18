package java2notice_tutorial.collectionExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MySubListLastIndex {
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
        list.add("jdbc");
        list.add("php");
        list.add("javascript");
        list.add("ruby");
        list.add("servlets");
        List<String> subList = new ArrayList<>();
        subList.add("php");
        subList.add("javascript");
        subList.add("ruby");
        System.out.println("Last index of sublist: " + Collections.lastIndexOfSubList(list, subList));
    }


}
