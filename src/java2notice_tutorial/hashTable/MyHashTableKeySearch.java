package java2notice_tutorial.hashTable;


import java.util.Hashtable;

public class MyHashTableKeySearch {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third", "THIRD INSERTED");
        if (ht.containsKey("first")) {
            System.out.println("The Hashtable contains key first");
        } else {
            System.out.println("The Hashtable doesn't contain key first");
        }
        if (ht.containsKey("fifth")) {
            System.out.println("The Hashtable contains key fifth");
        } else {
            System.out.println("The Hashtable doesn't contain key fifth");
        }
    }
}
