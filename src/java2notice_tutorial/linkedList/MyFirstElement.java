package java2notice_tutorial.linkedList;


import java.util.LinkedList;

public class MyFirstElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        System.out.println("First element: " + ll.element());
        System.out.println("First element: " + ll.getFirst());
        System.out.println("First element: " + ll.peek());
        System.out.println("First element: " + ll.peekFirst());
    }
}
