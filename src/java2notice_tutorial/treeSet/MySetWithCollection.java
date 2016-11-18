package java2notice_tutorial.treeSet;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MySetWithCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println("List: " + list);

        //create a TreeSet with a List
        TreeSet<String> mySet = new TreeSet<>(list);
        System.out.println("My Set: " + mySet);
    }
}
