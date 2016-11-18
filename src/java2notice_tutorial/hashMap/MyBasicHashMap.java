package java2notice_tutorial.hashMap;


import java.util.HashMap;

public class MyBasicHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        //add key-value pair to HashMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        //given value for the given key from HashMap
        System.out.println("Value of second: " + hm.get("second"));
        System.out.println("Is empty? " + hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of HM: " + hm.size());

    }
}
