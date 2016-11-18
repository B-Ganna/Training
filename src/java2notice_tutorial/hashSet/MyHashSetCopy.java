package java2notice_tutorial.hashSet;

import java.util.HashSet;

public class MyHashSetCopy {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<>();
        subSet.add("a1");
        subSet.add("a2");
        hs.addAll(subSet);
        System.out.println("Hash Set content after adding another collection: ");
        System.out.println(hs);

    }
}
