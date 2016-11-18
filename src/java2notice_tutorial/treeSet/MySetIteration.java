package java2notice_tutorial.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MySetIteration {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("one");
        ts.add("two");
        ts.add("three");

        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
