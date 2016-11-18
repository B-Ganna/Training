package java2notice_tutorial.treeMap;

import java.util.TreeMap;

public class TreeMapValueSearch {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("first", "FIRST INSERTED");
        tm.put("second", "SECOND INSERTED");
        tm.put("third", "THIRD INSERTED");
        System.out.println(tm);
        if (tm.containsValue("SECOND INSERTED")) {
            System.out.println("contains");
        } else {
            System.out.println("don't");
        }
        if (tm.containsValue("first")) {
            System.out.println("contains");
        } else {
            System.out.println("don't");
        }
    }
}
