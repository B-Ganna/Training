package java2notice_tutorial.linkedList;


import java.util.LinkedList;

public class MyLastElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        System.out.println("Last element: " + ll.getLast());
        System.out.println("Last element: " + ll.peekLast());
    }
}
