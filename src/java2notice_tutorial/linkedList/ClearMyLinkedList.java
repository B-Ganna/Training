package java2notice_tutorial.linkedList;


import java.util.LinkedList;

public class ClearMyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        System.out.println("Actual LinkedList: " + ll);
        ll.clear();
        System.out.println("After clear LinkedList: " + ll);

    }
}
