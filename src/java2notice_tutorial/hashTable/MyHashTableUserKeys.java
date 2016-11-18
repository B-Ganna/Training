package java2notice_tutorial.hashTable;


import java.util.Hashtable;

public class MyHashTableUserKeys {
    public static void main(String[] args) {
        Hashtable<Emp, String> ht = new Hashtable<>();
        ht.put(new Emp(134, "Ram", 3000), "RAM");
        ht.put(new Emp(235, "John", 6000), "JOHN");
        ht.put(new Emp(876, "Crish", 2000), "CRISH");
        ht.put(new Emp(512, "Tom", 2400), "TOM");
        System.out.println("Fetching value by creating new key: ");
        Emp e = new Emp(512, "Tom", 2400);
        System.out.println(e + " ==> " + ht.get(e));


    }
}
