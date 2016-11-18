package java2notice_tutorial.hashMap;


import java.util.HashMap;
import java.util.Set;

public class MyDeleteKeyObject {
    public static void main(String[] args) {
        HashMap<Price, String> hm = new HashMap<>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        printHashMap(hm);
        Price key = new Price("Banana", 20);
        System.out.println("Deleting key....");
        hm.remove(key);
        System.out.println("After deleting key: ");
        printHashMap(hm);
    }

    public static void printHashMap(HashMap<Price, String> map) {
        Set<Price> keys = map.keySet();
        for (Price p : keys) {          // TODO:  перебирание ключей
            System.out.println(p + " ==> " + map.get(p)); // вызов значения по ключу
        }
    }
}


