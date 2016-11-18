package java2notice_tutorial.hashMap;


import java.util.HashMap;

public class MyHashMapClear {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        hm.clear();
        System.out.println("My HashMap after clear: " + hm);
    }
}
