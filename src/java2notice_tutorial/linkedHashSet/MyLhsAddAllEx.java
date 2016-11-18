package java2notice_tutorial.linkedHashSet;


import java.util.HashSet;
import java.util.LinkedHashSet;

public class MyLhsAddAllEx {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println(lhs);
        HashSet<String> subSet = new HashSet<>();
        subSet.add("s1");
        subSet.add("s2");
        lhs.addAll(subSet);
        System.out.println("LHS after adding another collection: ");
        System.out.println(lhs);

    }
}
