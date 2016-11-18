package java2notice_tutorial.linkedList;


import java.util.LinkedList;

public class MyAllRemoveOprs {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        ll.add("four");
        ll.add("five");
        ll.add("six");
        ll.add("seven");
        ll.add("eight");
        ll.add("nine");
        System.out.println(ll);
        System.out.println("Remove() method: " + ll.remove());
        System.out.println("After remove() method call: ");
        System.out.println(ll);
        System.out.println("Remove(index) method: " + ll.remove(2));
        System.out.println("After remove(index) method call: ");
        System.out.println(ll);
        System.out.println("Remove(object) method: " + ll.remove("six"));
        System.out.println("After remove(index) method call: ");
        System.out.println(ll);
        System.out.println("Remove()first: " + ll.removeFirst());
        System.out.println("After remove(index) method call: ");
        System.out.println(ll);
        System.out.println("Remove()first occurrance method: " + ll.removeFirstOccurrence("eight"));
        System.out.println("After remove(index) method call: ");
        System.out.println(ll);
        System.out.println("Remove()last: " + ll.removeLast());
        System.out.println("After remove(index) method call: ");
        System.out.println(ll);
        System.out.println("Remove()last occurrance method: " + ll.removeLastOccurrence("five"));
        System.out.println("After remove(index) method call: ");
        System.out.println(ll);


    }
}
