package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyMaxUDOCComparable {
    public static void main(String[] args) {
        List<Empl> emps = new ArrayList<>();
        emps.add(new Empl(10, "Raghu", 25000));
        emps.add(new Empl(120, "Krish", 45000));
        emps.add(new Empl(210, "John", 14000));
        emps.add(new Empl(150, "Kishore", 24000));
        Empl maxSal = Collections.max(emps);
        System.out.println("Employee with max salary: " + maxSal);

    }
}
