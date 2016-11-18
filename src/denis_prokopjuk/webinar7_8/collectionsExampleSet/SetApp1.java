package denis_prokopjuk.webinar7_8.collectionsExampleSet;


import java.util.*;

public class SetApp1 {
    public static void main(String[] args) {
        System.out.println("---------Tree set---------");
        Set set = new TreeSet<>();
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(-10);

        System.out.println(set);
        set.clear();
        System.out.println(set);
        System.out.println("---------------------------");
        Set<Dog> set1 = new TreeSet();
        set1.add(new Dog("name1", 1));
        set1.add(new Dog("name2", 5));
        set1.add(new Dog("name7", 2));
        set1.add(new Dog("name89", 10));
        set1.add(new Dog("name3", 3));
        System.out.println(set1);

        System.out.println("---------TreeMap---------");
        Map<Integer, String> map = new TreeMap<>(); //// TODO: ключами в Map всегда является App3 (поэтому поведение Map всегда обусловлено поведением App3)
        map.put(4, "Thursday");
        map.put(1, "Monday");
        map.put(2, "Tuesday");
        map.put(3, "Wednesday");
        //App3<Integer> keys = map.keySet();
        for (int key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
        System.out.println("values: " + map.values());
        System.out.println(map);

        System.out.println("---------Dog TreeMap---------");
        Map<Dog, String> map1 = new TreeMap<>();
        map1.put(new Dog("name1", 3), "Val1");
        map1.put(new Dog("name1", 1), "Val2");
        map1.put(new Dog("name1", 0), "Val3");
        map1.put(new Dog("name1", 2), "Val4");
        System.out.println(map1.size());
        System.out.println(map1);
        for (Dog key : map1.keySet()) {
            System.out.println(key + " = " + map1.get(key));
        }


    }
}
