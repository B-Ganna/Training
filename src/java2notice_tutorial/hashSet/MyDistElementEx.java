package java2notice_tutorial.hashSet;


import java.util.HashSet;

public class MyDistElementEx {
    public static void main(String[] args) {
        HashSet<Price> phs = new HashSet<>();
        phs.add(new Price("Banana", 20));
        phs.add(new Price("Apple", 30));
        phs.add(new Price("Orange", 40));
        for (Price pr : phs) {
            System.out.println(pr);
        }
        Price duplicate = new Price("Banana", 20);
        System.out.println("Inserting duplicate object......");
        phs.add(duplicate);
        System.out.println("After insertion: ");
        for (Price pr : phs) {
            System.out.println(pr);
        }

    }
}
