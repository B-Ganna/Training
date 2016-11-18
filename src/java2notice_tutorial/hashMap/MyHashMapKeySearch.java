package java2notice_tutorial.hashMap;


import java.util.HashMap;

public class MyHashMapKeySearch {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        if (hm.containsKey("first")) {
            System.out.println("HashMap contains key 'first'");
        } else {
            System.out.println("HashMap doesn't contain key 'first'");
        }

        if (hm.containsKey("fifth")) {
            System.out.println("HashMap contains key 'fifth'");
        } else {
            System.out.println("HashMap doesn't contain key 'fifth'");
        }

    }
}
