package java2notice_tutorial.hashSet;


import java.util.HashSet;

public class MyHashSetRetain {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("first");
        hs.add("second");
        hs.add("third");
        hs.add("apple");
        hs.add("rat");
        System.out.println(hs);
        HashSet<String> subSet = new HashSet<>();
        subSet.add("rat");
        subSet.add("second");
        subSet.add("first");
        hs.retainAll(subSet);
        System.out.println("HashSet content: ");
        System.out.println(hs);

    }
}
