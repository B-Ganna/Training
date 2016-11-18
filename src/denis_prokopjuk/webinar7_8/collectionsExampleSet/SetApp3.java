package denis_prokopjuk.webinar7_8.collectionsExampleSet;


import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp3 {
    public static void main(String[] args) {
        Set<Cat> set = new LinkedHashSet<>();
        //App3<Cat> set1 = new HashSet<>();
        Cat cat1 = new Cat("Denia", 12);
        Cat cat2 = new Cat("Vasya", 3);
        Cat cat3 = new Cat("Anton", 18);
        //System.out.println(cat1.equals(cat2));
        System.out.println("cat1.HashCode = " + cat1.hashCode());
        System.out.println("cat2.HashCode = " + cat2.hashCode());
        System.out.println("cat3.HashCode = " + cat3.hashCode());

        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        System.out.println(set.size());
        System.out.println(set);
    }
}
