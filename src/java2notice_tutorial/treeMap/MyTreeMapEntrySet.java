package java2notice_tutorial.treeMap;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMapEntrySet {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("first", "FIRST INSERTED");
        tm.put("second", "SECOND INSERTED");
        tm.put("third", "THIRD INSERTED");
        System.out.println(tm);
        Set<Map.Entry<String, String>> entries = tm.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }
}
