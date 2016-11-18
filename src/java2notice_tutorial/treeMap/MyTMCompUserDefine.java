package java2notice_tutorial.treeMap;


import java.util.Set;
import java.util.TreeMap;

public class MyTMCompUserDefine {
    public static void main(String[] args) {
        TreeMap<Employee, String> tm = new TreeMap<>(new MyNameComp());
        tm.put(new Employee("Ram", 3000), "RAM");
        tm.put(new Employee("John", 6000), "JOHN");
        tm.put(new Employee("Crish", 2000), "CRISH");
        tm.put(new Employee("Tom", 2400), "TOM");
        Set<Employee> keys = tm.keySet();
        for (Employee key : keys) {
            System.out.println(key + " ==> " + tm.get(key));
        }
        System.out.println("===========================");

        TreeMap<Employee,String> trmap = new TreeMap<Employee, String>(new MySalaryComp());
        trmap.put(new Employee("Ram",3000), "RAM");
        trmap.put(new Employee("John",6000), "JOHN");
        trmap.put(new Employee("Crish",2000), "CRISH");
        trmap.put(new Employee("Tom",2400), "TOM");
        Set<Employee> ks = trmap.keySet();
        for(Employee key:ks){
            System.out.println(key+" ==> "+trmap.get(key));
        }

    }
}
