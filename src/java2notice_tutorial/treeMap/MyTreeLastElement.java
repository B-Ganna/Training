package java2notice_tutorial.treeMap;


import java.util.Map;
import java.util.TreeMap;

public class MyTreeLastElement {
    public static void main(String[] args) {
        TreeMap<Employee, String> tm = new TreeMap<>(new MySalaryComp());
        tm.put(new Employee("Ram", 3000), "RAM");
        tm.put(new Employee("John", 6000), "JOHN");
        tm.put(new Employee("Crish", 2000), "CRISH");
        tm.put(new Employee("Tom", 2400), "TOM");
        Employee emp = tm.lastKey();
        System.out.println("Least salary emp: " + emp);
        Map.Entry<Employee, String> ent = tm.lastEntry();
        System.out.println("Entry set values: ");
        System.out.println(ent.getKey() + "==> " + ent.getValue());
    }
}
