package java2notice_tutorial.treeSet;


import java.util.TreeSet;

public class MyCompUserDefine {
    public static void main(String[] args) {
        TreeSet<Empl> nameComp = new TreeSet<>(new MyNameComp());
        nameComp.add(new Empl("Ram", 3000));
        nameComp.add(new Empl("John", 6000));
        nameComp.add(new Empl("Crish", 2000));
        nameComp.add(new Empl("Tom", 2400));
        for (Empl e : nameComp) {
            System.out.println(e);
        }
        System.out.println("-----------------------");

        TreeSet<Empl> salaryComp = new TreeSet<>(new MySalaryComp());
        salaryComp.addAll(nameComp);
        for (Empl e : salaryComp) {
            System.out.println(e);
        }
    }
}
