package java2notice_tutorial.hashSet;

import java.util.HashSet;

public class MyHsDeleteObject {
    public static void main(String[] args) {
        HashSet<Price> phs = new HashSet<>();
        phs.add(new Price("Banana", 20));
        phs.add(new Price("Apple", 30));
        phs.add(new Price("Orange", 40));
        for (Price pr : phs) {
            System.out.println(pr);
        }
        Price key = new Price("Banana", 20);
        System.out.println("deleting key from set...");
        phs.remove(key);
        for (Price pr : phs) {
            System.out.println(pr);
        }
    }
}
