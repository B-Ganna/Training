package java2notice_tutorial.hashTable;


import java.util.Hashtable;

public class MyHashTableValueSearch {
    public static void main(String[] args) {
        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("first", "FIRST INSERTED");
        ht.put("second", "SECOND INSERTED");
        ht.put("third", "THIRD INSERTED");
        System.out.println(ht);
        if (ht.containsValue("SECOND INSERTED")) {
            System.out.println("The Hashtable contains value SECOND INSERTED");
        } else {
            System.out.println("The Hashtable doesn't contain value SECOND INSERTED");
        }
        if (ht.containsValue("first")) {
            System.out.println("The Hashtable contains value first");
        } else {
            System.out.println("The Hashtable doesn't contain value first");
        }
    }
}
