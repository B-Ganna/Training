package java2notice_tutorial.linkedHashSet;


import java.util.LinkedHashSet;

public class MyDistElementEx {
    public static void main(String[] args) {
        LinkedHashSet<Price> lhp = new LinkedHashSet<>();
        lhp.add(new Price("Banana", 20));
        lhp.add(new Price("Apple", 40));
        lhp.add(new Price("Orange", 30));
        for (Price pr : lhp) {
            System.out.println(pr);
        }
        Price duplicate = new Price("Banana", 20);
        System.out.println("Inserting duplicate object: ");
        lhp.add(duplicate);
        System.out.println("After insertion: ");
        for (Price pr: lhp){
            System.out.println(pr);
        }
    }
}
