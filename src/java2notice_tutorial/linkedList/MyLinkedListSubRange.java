package java2notice_tutorial.linkedList;


import java.util.LinkedList;
import java.util.List;

public class MyLinkedListSubRange {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        System.out.println("Actual LinkedList: " + ll);
        List<String> list = ll.subList(2, 4);
        System.out.println("Sub list: " + list);
    }
}
