package java2notice_tutorial.linkedHashSet;


import java.util.LinkedHashSet;

public class MyLhsDeleteEx {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println(lhs);
        lhs.remove("second");
        System.out.println("Elements after deleting: ");
        System.out.println(lhs);
    }
}
