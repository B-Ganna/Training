package denis_prokopjuk.webinar7_8.collectionsExampleSet;


import java.util.*;

public class SetApp2 {


    public static void main(String[] args) {
        // TODO: в HashSet уникальность определяется при помощи метода equals()
        // TODO: поэтому его надо переопределять!!

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(1);
        set.add(3);
        set.add(4);
        System.out.println(set.size());
        System.out.println("-----------Cat HashSet---------");
        Set<Cat> set1 = new HashSet<>();
        Cat cat1 = new Cat("Denia", 12);
        Cat cat2 = new Cat("Vasya", 3);
        Cat cat3 = new Cat("Anton", 18);
        //System.out.println(cat1.equals(cat2));
        System.out.println("cat1.HashCode = " + cat1.hashCode());
        System.out.println("cat2.HashCode = " + cat2.hashCode());
        System.out.println("cat3.HashCode = " + cat3.hashCode());

        set1.add(new Cat());
        set1.add(new Cat());
        set1.add(new Cat());
        System.out.println(set1.size());
        System.out.println(set1);

        System.out.println("-------------Cat HashMap-----------");
        Map<Cat, String> catMap = new TreeMap<>();
        catMap.put(cat1, "cat1");
        catMap.put(cat2, "cat2");
        catMap.put(cat3, "cat3");
        for (Cat cat : catMap.keySet()) {
            System.out.println(cat + " = " + catMap.get(cat));
        }


    }
}
