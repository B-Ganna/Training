package java2notice_tutorial.linkedHashSet;


import java.util.LinkedHashSet;

public class MyLinkedHashSetOperations {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println(lhs);
        System.out.println("LinkedHashSet size: " + lhs.size());
        System.out.println("Is LinkHS empty? " + lhs.isEmpty());

    }
}
