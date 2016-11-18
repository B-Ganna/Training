package java2notice_tutorial.linkedHashSet;


import java.util.LinkedHashSet;

public class MyLhsSearchEx {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println(lhs);
        System.out.println("Does set contains 'first'? " + lhs.contains("first"));
    }
}
