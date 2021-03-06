package java2notice_tutorial.hashMap;


import java.util.HashMap;
import java.util.Set;

public class MyHashMapRead {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println("Value of " + key + " is: " + hm.get(key));
        }
    }
}
