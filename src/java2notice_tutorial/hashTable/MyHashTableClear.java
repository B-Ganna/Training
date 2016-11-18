package java2notice_tutorial.hashTable;


import java.util.Hashtable;

public class MyHashTableClear {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third", "THIRD INSERTED");
        System.out.println("My hashTable content: ");
        System.out.println(ht);
        ht.clear();
        System.out.println("HashTable clear: ");
        System.out.println(ht);
    }
}


