package java2notice_tutorial.hashTable;


import java.util.Hashtable;

public class MyHAshTableOperations {
    public static void main(String[] args) {

        //create hashTable instance
        Hashtable<String, String> ht = new Hashtable<>();

        //add key-value pair to hashTable
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third", "THIRD INSERTED");
        System.out.println(ht);

        //getting value from the given key from the hashTable
        System.out.println("Value of key 'second': " + ht.get("second"));
        System.out.println("Is hashTable empty? " + ht.isEmpty());
        ht.remove("third");
        System.out.println(ht);
        System.out.println("Size of hashTable: " + ht.size());
    }
}
