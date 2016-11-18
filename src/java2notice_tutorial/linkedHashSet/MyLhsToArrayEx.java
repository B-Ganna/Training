package java2notice_tutorial.linkedHashSet;


import java.util.LinkedHashSet;

public class MyLhsToArrayEx {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        System.out.println("Linked HashSet content: ");
        System.out.println(lhs);
        String[] strArray = new String[lhs.size()];
        lhs.toArray(strArray);
        System.out.println("Copied array content: ");
        for (String str : strArray) {
            System.out.println(str);
        }
    }
}
