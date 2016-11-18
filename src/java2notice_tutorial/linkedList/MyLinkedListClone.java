package java2notice_tutorial.linkedList;


import java.util.LinkedList;

public class MyLinkedListClone {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        System.out.println("Actual LinkedList: " + ll);
        LinkedList<String> copy = (LinkedList<String>) ll.clone();
        System.out.println("Cloned LinkedList: " + copy);

    }
}

