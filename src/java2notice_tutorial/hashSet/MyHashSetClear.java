package java2notice_tutorial.hashSet;


import java.util.HashSet;

public class MyHashSetClear {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println("My Hashset content: ");
        System.out.println(hs);
        System.out.println("Clearing content: ");
        hs.clear();
        System.out.println("Hashset after clear: ");
        System.out.println(hs);
    }
}
