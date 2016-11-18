package java2notice_tutorial.linkedList;


import java.util.LinkedList;

public class MyAddFirst {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        System.out.println(ll);
        System.out.println("Adding element at first position: ");
        ll.addFirst("I'm first");
        System.out.println(ll);
        System.out.println("Adding element at first position: ");
        ll.addFirst("I'm first-2");
        System.out.println(ll);
    }
}
