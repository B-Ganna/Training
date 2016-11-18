package java2notice_tutorial.hashMap;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyHashMapEntrySet {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);

        Set<Map.Entry<String, String>> entrySet = hm.entrySet();
        for (Map.Entry<String, String> ent : entrySet) {
            System.out.println(ent.getKey() + " ==> " + ent.getValue());
        }
    }
}
