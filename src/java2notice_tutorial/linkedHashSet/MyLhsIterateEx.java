package java2notice_tutorial.linkedHashSet;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLhsIterateEx {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
