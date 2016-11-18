package java2notice_tutorial.treeMap;


import java.util.TreeMap;

public class MyTreMapClear {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("first", "FIRST INSERTED");
        tm.put("second", "SECOND INSERTED");
        tm.put("third", "THIRD INSERTED");
        System.out.println("My TreeMap content: " + tm);
        System.out.println("Clearing TreeMap...");
        tm.clear();
        System.out.println("After clearing: " + tm);
    }
}
