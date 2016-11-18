package java2notice_tutorial.treeMap;


import java.util.Set;
import java.util.TreeMap;

public class MyTreeMapRead {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>();
        tm.put("first", "FIRST INSERTED");
        tm.put("second", "SECOND INSERTED");
        tm.put("third", "THIRD INSERTED");
        System.out.println(tm);
        Set<String> keys = tm.keySet();
        for (String key : keys) {
            System.out.println("Value of " + key + " is: " + tm.get(key));
        }
    }
}
