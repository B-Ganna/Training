package java2notice_tutorial.hashMap;


import java.util.HashMap;

public class MyHashMapValueSearch {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        if (hm.containsValue("SECOND INSERTED")) {
            System.out.println("The hashmap contains value SECOND INSERTED");
        } else {
            System.out.println("The hashmap doesn't contain value SECOND INSERTED");
        }

        if (hm.containsValue("FIFTH INSERTED")) {
            System.out.println("The hashmap contains value FIFTH INSERTED");
        } else {
            System.out.println("The hashmap doesn't contain value FIFTH INSERTED");
        }
    }
}
