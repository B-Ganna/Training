package java2notice_tutorial.treeMap;


import java.util.Map;
import java.util.TreeMap;

public class MyReverseOrderMap {
    public static void main(String[] args) {
        TreeMap<String, String> tm = new TreeMap<>(new MyComp());
        tm.put("java", "language");
        tm.put("computer", "machine");
        tm.put("india", "country");
        tm.put("mango", "fruit");
        tm.put("game", "cricket");
        System.out.println("TreeMap entries: ");
        System.out.println(tm);
        Map<String, String> rm = tm.descendingMap();
        System.out.println("Reverse Map content: ");
        System.out.println(rm);
    }
}
