package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class MyListEnumeration {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");
        Enumeration<String> em = Collections.enumeration(ls);
        while (em.hasMoreElements()) {
            System.out.println(em.nextElement());
        }
    }
}
