package java2notice_tutorial.linkedList;


import java.util.LinkedList;
import java.util.List;

public class MyElementCheck {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        List<String> list = new LinkedList<>();
        list.add("second");
        list.add("random");
        System.out.println("Does LinkedList contains all list elements?: " + ll.containsAll(list));
        list.add("one");
        System.out.println("Does LinkedList contains all list elements?: " + ll.containsAll(list));

    }
}
