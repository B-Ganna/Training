package java2notice_tutorial.linkedList;


import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListSwap {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Java");
        ll.add("Cric");
        ll.add("Play");
        ll.add("Watch");
        ll.add("Glass");
        ll.add("Movie");
        ll.add("Girl");

        Collections.swap(ll, 2, 5);
        System.out.println("Results after swap operation:");
        for (String str : ll) {
            System.out.println(str);
        }
    }
}
