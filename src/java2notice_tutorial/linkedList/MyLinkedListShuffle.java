package java2notice_tutorial.linkedList;


import java.util.Collections;
import java.util.LinkedList;

public class MyLinkedListShuffle {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Java");
        ll.add("Cric");
        ll.add("Play");
        ll.add("Watch");
        ll.add("Glass");
        Collections.shuffle(ll);
        System.out.println("Results after shuffle operation:");
        for (String str : ll) {
            System.out.println(str);
        }

        Collections.shuffle(ll);
        System.out.println("Results after shuffle operation:");
        for (String str : ll) {
            System.out.println(str);
        }
    }
}
