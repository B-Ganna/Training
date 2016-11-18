package java2notice_tutorial.hashSet;


import java.util.HashSet;

public class MyHashSetSearchObj {
    public static void main(String[] args) {
        HashSet<Price> hs = new HashSet<>();
        hs.add(new Price("Banana", 20));
        hs.add(new Price("Apple", 40));
        hs.add(new Price("Orange", 30));
        for (Price pr : hs) {
            System.out.println(pr);
        }
        Price key = new Price("Banana", 20);
        System.out.println("Does set contains key? " + hs.contains(key));

    }
}
