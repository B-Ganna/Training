package java2notice_tutorial.treeMap;


import java.util.TreeMap;

public class MyBasicOperations {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("first", "FIRST INSERTED");
        tm.put("second", "SECOND INSERTED");
        tm.put("third", "THIRD INSERTED");
        System.out.println(tm);
        System.out.println("Value of second: " + tm.get("second"));
        System.out.println("Is empty? " + tm.isEmpty());
        tm.remove("third");
        System.out.println(tm);
        System.out.println("Size of the TreeMap: " + tm.size());
    }
}
