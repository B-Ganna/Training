package java2notice_tutorial.hashTable;


import java.util.Hashtable;
import java.util.Set;

public class MyHashTableKeys {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third", "THIRD INSERTED");
        System.out.println(ht);
        Set<String> keys = ht.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
