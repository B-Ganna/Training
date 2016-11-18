package java2notice_tutorial.treeSet;


import java.util.Set;
import java.util.TreeSet;

public class MyUserDuplicates {
    public static void main(String[] args) {
        Set<Emp> ts = new TreeSet<>(new EmpComp());
        ts.add(new Emp(201, "John", 40000));
        ts.add(new Emp(302, "Krish", 44500));
        ts.add(new Emp(146, "Tom", 20000));
        ts.add(new Emp(543, "Abdul", 10000));
        ts.add(new Emp(12, "Dinesh", 50000));

        //enter duplicate entry
        ts.add(new Emp(146, "Tom", 20000));
        for (Emp e : ts) {
            System.out.println(e);
        }
    }
}
