package java2notice_tutorial.treeSet;


import java.util.TreeSet;

public class MyLeastElementSet {
    public static void main(String[] args) {
        TreeSet<Empl> salaryCompr = new TreeSet<Empl>(new MySalaryComp());
        salaryCompr.add(new Empl("Ram", 3000));
        salaryCompr.add(new Empl("John", 6000));
        salaryCompr.add(new Empl("Crish", 2000));
        salaryCompr.add(new Empl("Tom", 2400));
        System.out.println("List salary empl: " + salaryCompr.first());


    }
}
