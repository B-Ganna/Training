package java2notice_tutorial.linkedList;


import java.util.LinkedList;

public class MyBasicOpertions {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Orange");
        ll.add("Apple");
        ll.add("Grape");
        ll.add("Banana");
        System.out.println(ll);
        System.out.println("Size of the LinkedList: " + ll.size());
        System.out.println("Is LinkedList empty? " + ll.isEmpty());
        System.out.println("Does LinkedList contains 'Grape'? " + ll.contains("Grape"));
    }
}
