package java2notice_tutorial.linkedHashMap;


import java.util.LinkedHashMap;
import java.util.Set;

public class MyMapIterate {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "this element inserted at 3rd position");
        Set<String> keys = lhm.keySet();
        for (String key : keys) {
            System.out.println(key + " ==> " + lhm.get(key));
        }
    }
}
