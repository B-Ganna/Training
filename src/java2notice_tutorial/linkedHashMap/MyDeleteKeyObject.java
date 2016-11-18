package java2notice_tutorial.linkedHashMap;


import java.util.LinkedHashMap;
import java.util.Set;

public class MyDeleteKeyObject {
    public static void main(String[] args) {
        LinkedHashMap<Price, String> hm = new LinkedHashMap<>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        printMap(hm);
        Price key = new Price("Banana", 20);
        hm.remove(key);
        printMap(hm);

    }

    public static void printMap(LinkedHashMap<Price, String> map) {
        Set<Price> keys = map.keySet();
        for (Price pp : keys) {
            System.out.println(pp + " ==> " + map.get(pp));
        }
    }
}
