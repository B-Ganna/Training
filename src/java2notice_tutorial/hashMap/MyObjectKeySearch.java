package java2notice_tutorial.hashMap;


import java.util.HashMap;
import java.util.Set;

public class MyObjectKeySearch {
    public static void main(String[] args) {
        HashMap<Price, String> hm = new HashMap<>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        printMap(hm);
        Price key = new Price("Banana", 20);
        System.out.println("Does key available? " + hm.containsKey(key));
    }

    public static void printMap(HashMap<Price, String> map) {
        Set<Price> key = map.keySet();
        for (Price p : key) {
            System.out.println(p + " ==> " + map.get(p));
        }
    }
}
