package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMaxComparator {
    public static void main(String[] args) {
        List<Empy> emps = new ArrayList<>();
        emps.add(new Empy(10, "Raghu", 25000));
        emps.add(new Empy(120, "Krish", 45000));
        emps.add(new Empy(210, "John", 14000));
        emps.add(new Empy(150, "Kishore", 24000));
        Empy maxSal = Collections.max(emps, new EmpyComp());
        System.out.println("Employee with max salary: " + maxSal);
    }
}
