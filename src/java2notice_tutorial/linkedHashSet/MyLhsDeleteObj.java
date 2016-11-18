package java2notice_tutorial.linkedHashSet;


import java.util.LinkedHashSet;

public class MyLhsDeleteObj {
    public static void main(String[] args) {
        LinkedHashSet<Price> lhp = new LinkedHashSet<>();
        lhp.add(new Price("Banana", 20));
        lhp.add(new Price("Apple", 40));
        lhp.add(new Price("Orange", 30));
        for (Price pr : lhp) {
            System.out.println(pr);
        }
        Price key = new Price("Banana", 20);
        lhp.remove(key);
        System.out.println("After removal: ");
        System.out.println(lhp);
    }
}
