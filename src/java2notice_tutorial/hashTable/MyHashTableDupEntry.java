package java2notice_tutorial.hashTable;


import java.util.Hashtable;
import java.util.Set;

public class MyHashTableDupEntry {
    public static void main(String[] args) {
        Hashtable<Emp, String> ht = new Hashtable<>();
        ht.put(new Emp(134, "Ram", 3000), "RAM");
        ht.put(new Emp(235, "John", 6000), "JOHN");
        ht.put(new Emp(876, "Crish", 2000), "CRISH");
        ht.put(new Emp(512, "Tom", 2400), "TOM");
        System.out.println("Adding duplicate entry: ");
        ht.put(new Emp(512, "Tom", 2400), "TOM");
        System.out.println("HashTable entries: ");
        Set<Emp> keys = ht.keySet();
        for (Emp key : keys) {
            System.out.println(key + " ==> " + ht.get(key));
        }
        System.out.println("Duplicate got eliminated!!");
    }
}
