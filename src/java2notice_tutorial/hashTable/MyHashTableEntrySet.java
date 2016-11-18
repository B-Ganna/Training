package java2notice_tutorial.hashTable;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MyHashTableEntrySet {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third", "THIRD INSERTED");
        System.out.println(ht);
        //getting value for the given key from the HashSet
        Set<Map.Entry<String, String>> entries = ht.entrySet();
        for (Map.Entry<String, String> ent : entries) {
            System.out.println(ent.getKey() + "==>" + ent.getValue());
        }
    }
}


