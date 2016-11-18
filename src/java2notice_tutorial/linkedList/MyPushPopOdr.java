package java2notice_tutorial.linkedList;


import java.util.LinkedList;

public class MyPushPopOdr {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("first");
        ll.add("second");
        ll.add("third");
        ll.add("random");
        System.out.println(ll);
        ll.push("push element");
        System.out.println("After push operation");
        System.out.println(ll);
        ll.pop();
        System.out.println("After pop operation");
        System.out.println(ll);


    }
}
