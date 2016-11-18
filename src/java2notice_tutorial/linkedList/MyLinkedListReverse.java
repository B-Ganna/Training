package java2notice_tutorial.linkedList;


import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListReverse {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Java");
        ll.add("Cric");
        ll.add("Play");
        ll.add("Watch");
        ll.add("Glass");
        Collections.reverse(ll);
        System.out.println("Results after reverse operation: ");
        for (String str : ll) {
            System.out.println(str);
        }
    }
}
