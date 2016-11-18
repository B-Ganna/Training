package java2notice_tutorial.treeSet;


import java.util.TreeSet;

public class MyBasicTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("one");
        ts.add("two");
        ts.add("three");
        System.out.println("Elements: " + ts);
        System.out.println("Is empty? " + ts.isEmpty());
        ts.clear();
        System.out.println("Is empty? " + ts.isEmpty());
        ts.add("one");
        ts.add("two");
        ts.add("three");
        System.out.println("Size of the set: " + ts.size());
        ts.remove("two");
        System.out.println(ts);
    }
}
