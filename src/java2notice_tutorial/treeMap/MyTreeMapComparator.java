package java2notice_tutorial.treeMap;


import java.util.TreeMap;

public class MyTreeMapComparator {
    public static void main(String[] args) {
        TreeMap<String,String>tm = new TreeMap<>(new MyComp());
        tm.put("java","language");
        tm.put("computer","machine");
        tm.put("india","country");
        tm.put("mango","fruit");
        System.out.println(tm);

    }
}
