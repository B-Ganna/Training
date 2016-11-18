package java2notice_tutorial.treeMap;


import java.util.Map;
import java.util.TreeMap;

public class MySubTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>(new MyComp());
        tm.put("java", "language");
        tm.put("computer", "machine");
        tm.put("india", "country");
        tm.put("mango", "fruit");
        tm.put("game", "cricket");
        System.out.println(tm);
        Map<String, String> subMap = tm.subMap("game", "java");
        System.out.println(subMap);
        Map<String, String> subMap1 = tm.subMap("game", true, "java", true);
        System.out.println(subMap1);
        Map<String, String> subMap2 = tm.subMap("game", false, "java", true);
        System.out.println(subMap2);
    }
}
