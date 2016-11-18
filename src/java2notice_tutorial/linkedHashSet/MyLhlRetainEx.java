package java2notice_tutorial.linkedHashSet;


import java.util.LinkedHashSet;

public class MyLhlRetainEx {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        lhs.add("apple");
        lhs.add("rat");
        System.out.println(lhs);
        LinkedHashSet<String> subSet = new LinkedHashSet<>();
        subSet.add("rat");
        subSet.add("second");
        subSet.add("first");
        lhs.retainAll(subSet);
        System.out.println("LinkedHashSet content: ");
        System.out.println(lhs);
    }
}
