package java2notice_tutorial.hashMap;


import java.util.HashMap;

public class MyHashMapCopy {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);

        HashMap<String, String> subMap = new HashMap<>();
        subMap.put("s1", "S1 VAlUE");
        subMap.put("s2", "S2 VALUE");
        hm.putAll(subMap);
        System.out.println(hm);
    }
}
