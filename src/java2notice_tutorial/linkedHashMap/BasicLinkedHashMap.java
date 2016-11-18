package java2notice_tutorial.linkedHashMap;


import java.util.LinkedHashMap;

public class BasicLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "this element inserted at 3rd position");
        System.out.println(lhm);
        System.out.println("Getting value for key 'one': " + lhm.get("one"));
        System.out.println("Size of the map: " + lhm.size());
        System.out.println("Is lhm empty? " + lhm.isEmpty());
        System.out.println("Contains key 'two'? " + lhm.containsKey("two"));
        System.out.println("Contains value 'This is first element'? " + lhm.containsValue("This is first element"));
        System.out.println("Delete element 'one' " + lhm.remove("one"));
        System.out.println(lhm);
    }
}
