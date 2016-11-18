package java2notice_tutorial.linkedHashMap;


import java.util.LinkedHashMap;

public class MyMapClear {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "this element inserted at 3rd position");
        System.out.println(lhm);
        lhm.clear();
        System.out.println(lhm);
    }
}
