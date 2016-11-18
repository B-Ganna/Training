package java2notice_tutorial.hashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class MyHashTableEnumeration {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third", "THIRD INSERTED");
        Enumeration<String> keys = ht.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Value of " + key + " is " + ht.get(key));
        }
    }
}
