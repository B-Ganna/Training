package java2notice_tutorial.linkedList;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedlistNewCollection {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        //add element to the end
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        System.out.println("Actual LinkedList: " + ll);
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        ll.addAll(list);
        System.out.println("After copy: " + ll);

    }
}
