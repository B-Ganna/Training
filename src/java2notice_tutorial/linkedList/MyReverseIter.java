package java2notice_tutorial.linkedList;


import java.util.Iterator;
import java.util.LinkedList;

public class MyReverseIter {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        Iterator<String> itr = ll.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
