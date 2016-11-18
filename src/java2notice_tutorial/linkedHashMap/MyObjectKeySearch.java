package java2notice_tutorial.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

public class MyObjectKeySearch {
    public static void main(String[] args) {
        LinkedHashMap<Price, String> hm = new LinkedHashMap<>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        printMap(hm);
        Price key = new Price("Banana", 20);
        System.out.println("Does key available? " + hm.containsKey(key));
    }

    public static void printMap(LinkedHashMap<Price, String> map) {
        Set<Price> keys = map.keySet();
        for (Price key : keys) {
            System.out.println(key + " ==> " + map.get(key));
        }
    }
}
