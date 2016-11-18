package java2notice_tutorial.treeSet;


import java.util.TreeSet;

public class MyHighSalEmp {
    public static void main(String[] args) {
        TreeSet<Empl> salaryComp = new TreeSet<>(new MySalaryComp());
        salaryComp.add(new Empl("Ram", 3000));
        salaryComp.add(new Empl("John", 6000));
        salaryComp.add(new Empl("Crish", 2000));
        salaryComp.add(new Empl("Tom", 2400));
        System.out.println("Highest salary emp: " + salaryComp.last());
    }
}
