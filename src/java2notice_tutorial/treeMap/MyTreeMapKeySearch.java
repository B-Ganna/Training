package java2notice_tutorial.treeMap;

import java.util.TreeMap;

public class MyTreeMapKeySearch {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("first", "FIRST INSERTED");
        tm.put("second", "SECOND INSERTED");
        tm.put("third", "THIRD INSERTED");

        if (tm.containsKey("first")) {
            System.out.println("TM contains ");
        } else {
            System.out.println("TM doesn't contain");
        }
        if (tm.containsKey("fifth")) {
            System.out.println("TM contains");
        } else {
            System.out.println("TM doesn't contain");
        }
    }
}
