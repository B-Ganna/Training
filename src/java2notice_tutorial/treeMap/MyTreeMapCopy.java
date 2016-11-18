package java2notice_tutorial.treeMap;


import java.util.TreeMap;

public class MyTreeMapCopy {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("first", "FIRST INSERTED");
        tm.put("second", "SECOND INSERTED");
        tm.put("third", "THIRD INSERTED");
        System.out.println(tm);

        TreeMap<String, String> subMap = new TreeMap<>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        tm.putAll(subMap);
        System.out.println(tm);

    }
}
