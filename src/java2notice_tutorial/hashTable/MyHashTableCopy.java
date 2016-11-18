package java2notice_tutorial.hashTable;


import java.util.HashMap;
import java.util.Hashtable;

public class MyHashTableCopy {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third", "THIRD INSERTED");
        System.out.println(ht);
        HashMap<String, String> subMap = new HashMap<>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        ht.putAll(subMap);
        System.out.println(ht);
    }
}
